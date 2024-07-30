package com.ktdsuniversity.edu.collection.list.school;

public class Student {

	public static final int SUBJECTS_NUMBER = 2;
	private String name;
	private int javaScore;
	private int frontScore;
	
	public Student(String name, int javaScore, int frontScore) {
		this.name = name;
		this.javaScore = javaScore;
		this.frontScore = frontScore;
	}
	
	public int getSumScore() {
		return this.javaScore + this.frontScore;
	}
	
	public double getAverageScore() {
		return (double) getSumScore() / SUBJECTS_NUMBER;
	}
	
	@Override
	public String toString() {
		String format = "이름: %s, Java: %d, Front: %d";
		return String.format(format, this.name, this.javaScore, this.frontScore);
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student otherStudent = (Student) obj;
			return this.name.equals(otherStudent.name);
		}else if (obj instanceof String) {
			return this.equals(obj);
		}
		return false;
	}
}
