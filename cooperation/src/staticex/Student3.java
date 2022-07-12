package staticex;

public class Student3 {
    private static int serialNum = 1000;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;
    public int cardNumber;

    public Student3() {
        serialNum++;
        studentID = serialNum;
        cardNumber = serialNum + 100;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student3.serialNum = serialNum;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
