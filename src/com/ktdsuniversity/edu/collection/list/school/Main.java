package com.ktdsuniversity.edu.collection.list.school;

public class Main {

	public static void main(String[] args) {
		// 이 학교에는 동명이인이 많다.
		// 이름이 같으면 반드시 같은 사람이다
		School school = new School();
		
		Student student1 = new Student("shin" , 50, 40);
		Student student2 = new Student("dong" , 70, 20);
		Student student3 = new Student("won" , 60, 70);
		
		school.addStudent(student1); // student1의 메모리 주소 같기 때문
		school.addStudent(student1);
		school.addStudent(student1);
		school.addStudent(student1);
		school.addStudent(student1);
		
		school.addStudent(student2);
		school.addStudent(student3);
		
		System.out.println(school.getSumScore());
		System.out.println(school.getAverageScores());
		
		System.out.println(school.toString());
		
		school.removeStudent(0);
		
		System.out.println("===========");
		System.out.println(school.toString());
		
		System.out.println(school.getStudent(0));
		
		school.removerStudent("dong");
		System.out.println(school.toString());
	}
}
