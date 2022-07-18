package q5;

public class Student {
    private String number;
    private String name;

    public Student(String number, String name) {
        this.name = name;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(number);
    }

    @Override
    public String toString() {
        return number + ":" + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student) obj;
            if (this.number == std.number)
                return true;
            else
                return false;
        }
        return false;
    }
}
