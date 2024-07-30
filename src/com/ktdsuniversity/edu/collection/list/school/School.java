package com.ktdsuniversity.edu.collection.list.school;

import java.util.ArrayList;
import java.util.List;

public class School {

	private List<Student> studentList;

	public School() {
		this.studentList = new ArrayList<>();
	}
	
	public void addStudent(Student student) {
		// studentList에 학생 추가
		// 이미 등록된 학생은 추가 불가능
		if(!studentList.contains(student)) { // contains는 메모리 주소 비교 -> equals 오바라이딩 해서 해결
			studentList.add(student);
		}
		
//		boolean contains = false;
//		for (Student eachStudent : this.studentList) {
//			if (eachStudent.getName().equals(student.getName())) {
//				contains = true;
//				break;
//			}
//		}
//		if (!contains) {
//			this.studentList.add(student);
//		}
	}
	
	public void removerStudent(String name) {
		int index = this.studentList.indexOf(new Student(name, 0, 0)); // -1
		this.studentList.remove(index);
		
	}
	
	public void removeStudent(int index) {
		if (index < 0 || index >= this.studentList.size()) {
			throw new IndexOutOfBoundsException(index);
		}
		// 해당 인덱스의 학생 삭제
		studentList.remove(index);
	}
	
	public Student getStudent(int index) {
		if (index < 0 || index >= this.studentList.size()) {
			throw new IndexOutOfBoundsException(index);
		}
		// 해당 인덱스의 학생을 반환
		return studentList.get(index);
		
	}
	
	public Student getStudent(String name) {
		int index = this.studentList.indexOf(new Student (name, 0, 0));
		return this.studentList.get(index);
	}
	
	public int getSumScore() {
		// 모든 학생들의 점수 총합 반환
		int sum = 0;
		for(Student student : this.studentList) {
			sum += student.getSumScore();
		}
		return sum;
	}
	
	public double getAverageScores() {
		// 모든 학생들의 평균 반환
		double averageSum = 0;
		double average = 0;
		for(Student student : this.studentList) {
			averageSum += student.getAverageScore();
			average = (double) averageSum / this.studentList.size();
		}
		return average;
	}
	
	@Override
	public String toString() {
		// 모든 학생들의 정보를 출력
		StringBuffer sb = new StringBuffer();
		for(Student student : studentList) {
			// System.out.println(student.toString());
			sb.append(student + "\n");
		}
		// Student 클래스의 toString 이용
		return sb.toString();
	}
}
