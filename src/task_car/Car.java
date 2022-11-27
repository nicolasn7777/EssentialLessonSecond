package task_car;

public class Car {
    private int year;
    private String color;

    public Car() {
    }

    public Car(int year) {
        this.year = year;
        this.color = "Blue";
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }
}
