package school;

import utils.Define;

import java.util.ArrayList;

public class Subject {
    private String subjectName;
    private int subjectID;
    private int gradeType;
    private ArrayList<Student> studentList = new ArrayList<>();

    public Subject(String subjectName, int subjectID) {
        this.subjectName = subjectName;
        this.subjectID = subjectID;
        this.gradeType = Define.AB_TYPE;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void register(Student student) {
        studentList.add(student);
    }
}
