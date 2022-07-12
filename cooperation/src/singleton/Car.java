package singleton;

public class Car {
    private static int num = 10001;
    private int carNum;

    public Car() {
        carNum = num;
        num++;
    }

    public int getCarNum() {
        return carNum;
    }
}
