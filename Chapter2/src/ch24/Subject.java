package ch24;

public class Subject {

	String subjectName;
	int subjectScore;
	
	public Subject(String subjectName, int subjectScore) {
		this.subjectName = subjectName;
		this.subjectScore = subjectScore;
	}
	
	public String showInfo() {
		return subjectName + " 과목  성적은 " + subjectScore + " 입니다.";
	}
}
