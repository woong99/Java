package q5;

public class CalcTest {
    public static void main(String[] args) {
        Calc calc = (n1, n2) -> {
            return n1 + n2;
        };
        System.out.println(calc.add(10, 20));

    }
}
