package q5;

public abstract class Car {
    public abstract void start();

    public abstract void drive();

    public abstract void stop();

    public abstract void turnOff();

    private void washCar() {
        System.out.println("세차를 합니다.");
    }

    final public void run() {
        start();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
