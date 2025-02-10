package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;
import com.utility.DBUtility;

public class StudentDao {
	public int saveStudent(Student student) {
		int i = 0;
		String sql = "insert into student values(?,?,?)";
		try(PreparedStatement pst = DBUtility.getDB().prepareStatement(sql)){
			pst.setInt(1,student.getId());
			pst.setString(2, student.getName());
			pst.setDouble(3,student.getMarks());
			i = pst.executeUpdate();
		}catch(Exception e) {
			System.out.println("studentDAO " + e);
		}
		return i;
	}
	
	public int deleteStudent(int id) {
		int i = 0;
		String sql = "delete from student where id = ?";
		try(PreparedStatement pst = DBUtility.getDB().prepareStatement(sql)){
			pst.setInt(1,id);
			i = pst.executeUpdate();
			
		}catch(Exception e) {
			System.out.println("studentDelete " + e);
		}
		return i;
	}
	
	public int updateStudent(Student updateStudent) {
		int i = 0;
		String sql = "UPDATE STUDENT set name=? , marks=? where id=?";
		try (PreparedStatement ps = DBUtility.getDB().prepareStatement(sql)) {
			ps.setString(1, updateStudent.getName());
			ps.setDouble(2, updateStudent.getMarks());
			ps.setInt(3, updateStudent.getId());
			i = ps.executeUpdate();
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("StudentDAO  saveStudent   " + e);
		}
		return i;
	}
	
	
	public List<Student> getAllStudent(){
		List<Student> list = new ArrayList<>();
		String sql = "Select * from student";
		try(PreparedStatement pst = DBUtility.getDB().prepareStatement(sql)){
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Student student = new Student(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				list.add(student);
			}
		}catch(Exception e) {
			System.out.println("getAllStudent " + e);
		}
		return list;
	}
	public Student getStudentById(int id) {
		String sql = "select * from student where id = ?";
		try(PreparedStatement pst = DBUtility.getDB().prepareStatement(sql)){
			pst.setInt(1,id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Student student = new Student(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				return student;
			}
		}catch(Exception e) {
			System.out.println("getStudentById " + e);
		}
		return null;
	}
	public int getStudentCount() {
		String sql = "select count(*) from student";
		try(PreparedStatement pst = DBUtility.getDB().prepareStatement(sql)){
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}else {
				 System.out.println("no record is present");
			}
		}catch(Exception e) {
			System.out.println("getStundetCount " + e);
		}
		return 0;
	}
}
