package task_car_overload;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this.year = 10;
        this.speed = 200;
        this.weight = 100;
        this.color = "Red";
    }

    public Car(int year) {
        this.year = year;
        this.speed = 210;
        this.weight = 110;
        this.color = "Blue";
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 120;
        this.color = "Green";
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "Grey";
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

}
