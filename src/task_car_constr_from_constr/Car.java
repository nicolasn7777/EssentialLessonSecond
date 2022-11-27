package task_car_constr_from_constr;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this(10, 200, 100, "Red");
    }

    public Car(int year) {
        this(year, 210, 110, "Blue");
    }

    public Car(int year, double speed) {
        this(year, speed, 120, "Green");
    }

    public Car(int year, double speed, int weight) {
        this(year, speed, weight, "Grey");
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
