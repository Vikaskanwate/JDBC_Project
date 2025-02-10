package com.App;

import java.util.Iterator;
import java.util.Scanner;

import com.dao.StudentDao;
import com.model.Student;

public class App {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		StudentDao  sd = new StudentDao();
		int option = 0;
		int x = 0;
		do {
			System.out.println("**********");
			System.out.println("*1 : ADD STUDENT");
			System.out.println("*2 : DELETE STUDENT BY ID");
			System.out.println("*3 : UPDATE STUDENT");
			System.out.println("*4 : GET STUDENT");
			System.out.println("*5 : GET STUDENT BY ID");
			System.out.println("*6 : TOTAL NO OF STUDENTS");
			System.out.println("**********");
			
			System.out.println("Enter option ");
			option = sc.nextInt();
			switch(option) {
			case 1: 
				Student student = inputStudent();
				if(sd.saveStudent(student) > 0) {
					System.out.println("Student is added");
				}else {
					System.out.println("Student is not added");	
				}
				break;
				
			case 2:
				System.out.println("Enter ID ");
				int id = sc.nextInt();

				if (sd.deleteStudent(id) > 0) {
					System.out.println("Delete Student SUCCESS !!!");
				} else {
					System.out.println("Delete Student FAILED !!!");
				}
				break;
				
			case 3:
				Student student2 = inputStudent();

				if(sd.updateStudent(student2) > 0) {
					System.out.println("updated Student SUCCESS !!!");
				}
				else {
					System.out.println("update Student FAILED !!!");
				}
				break;
			
			case 4:
				System.out.println("id\tname\tmarks");
				
				Iterator<Student> it = sd.getAllStudent().iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				break;
				
			case 5: 
				System.out.println("Enter the id ");
				id = sc.nextInt();
				System.out.println("id\tname\tmarks");
				System.out.println(sd.getStudentById(id));
				break;
			
			case 6:
				System.out.println("Student count is :"+sd.getStudentCount());
				break;
			}
			System.out.println("For Contiune Press 1");
			x = sc.nextInt();
	}while(x == 1);
}
	public static Student inputStudent() {
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter Name");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter marks");
		double marks = sc.nextDouble();
		return new Student(id,name,marks);
	}
	
}

