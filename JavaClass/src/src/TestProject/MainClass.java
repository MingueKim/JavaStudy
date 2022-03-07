package TestProject;

public class MainClass {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.color = "black";
        myCar.gear = "auto";
        myCar.price = 30000000;

        myCar.run();
        myCar.stop();
    }
}
