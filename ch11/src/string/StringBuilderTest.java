package string;

public class StringBuilderTest {
    public static void main(String[] args) {
        String javaStr = new String("java");
        System.out.println("javaStr 문자열 주소 :" + System.identityHashCode(javaStr));

        StringBuilder sb = new StringBuilder(javaStr);
        System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(sb));

        sb.append(" and");
        sb.append(" android");
        sb.append(" programming is fun!!!");
        System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(sb));

        javaStr = sb.toString();
        System.out.println(javaStr);
        System.out.println("연결된 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
    }
}
