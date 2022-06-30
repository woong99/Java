package ch24;

import java.util.ArrayList;

public class Student {

	int num;
	String name;
	ArrayList<Subject> subject = new ArrayList<>(); 
	int total;
	
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public void addSubject(String subjectName, int subjectScore) {
		subject.add(new Subject(subjectName, subjectScore));
	}
	
	public void showStudentInfo() {
		for(int i = 0; i < subject.size(); i++) {
			System.out.println("학생 " + this.name + "의 " + subject.get(i).showInfo());
			total += subject.get(i).subjectScore; 
		}
		System.out.println("학생 " + this.name + "의 총점은 " + total + " 입니다.");
	}
}
