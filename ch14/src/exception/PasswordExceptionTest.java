package exception;

public class PasswordExceptionTest {
    private String pwd;


    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) throws PasswordException {
        if (pwd == null) {
            throw new PasswordException("비밀번호는 null일 수 없습니다.");
        } else if (pwd.matches("[a-zA-Z]+")) {
            throw new PasswordException("비밀번호는 문자열로만 이루어질 수 없습니다.");
        } else if (pwd.length() <= 5) {
            throw new PasswordException("비밀번호는 5자 이하일 수 없습니다.");
        }
    }

    public static void main(String[] args) {
        PasswordExceptionTest test = new PasswordExceptionTest();
        try {
            test.setPwd(null);
        } catch (PasswordException e) {
            System.out.println(e);
        }

        try {
            test.setPwd("abcdef");
        } catch (PasswordException e) {
            System.out.println(e);
        }

        try {
            test.setPwd("123");
        } catch (PasswordException e) {
            System.out.println(e);
        }
    }
}
