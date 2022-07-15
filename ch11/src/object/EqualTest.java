package object;

public class EqualTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "Lee");
        Student studentLee2 = studentLee;
        Student studentSang = new Student(100, "Lee");

        if (studentLee == studentLee2) {
            System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
        } else {
            System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
        }

        if (studentLee.equals(studentLee2)) {
            System.out.println("studentLee와 studentLee2는 동일합니다.");
        } else {
            System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
        }

        if (studentLee == studentSang) {
            System.out.println("studentLee와 studentSang의 주소는 같습니다.");
        } else {
            System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
        }

        if (studentLee.equals(studentSang)) {
            System.out.println("studentLee와 studentSang은 동일합니다.");
        } else {
            System.out.println("studentLee와 studentSang은 동일하지 않습니다.");
        }
    }
}

class Student {
    int studentID;
    String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String toString() {
        return studentID + " , " + studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student) obj;
            if (this.studentID == std.studentID) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}