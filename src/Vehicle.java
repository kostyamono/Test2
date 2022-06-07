abstract class Vehicle {
    double engine;
    int wheels;
    int gears;

    void move(){
        System.out.println(Vehicle.class.getName() + " едет");
    };
    abstract void turn();
    abstract void accelerate();
    abstract void brake();
}
