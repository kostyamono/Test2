public class Moto extends Vehicle{
    public Moto(double engine, int gears, int wheels) {

    }


    @Override
    void turn() {
        System.out.println("Мотоцикл поворачивает");

    }

    @Override
    void accelerate() {
        System.out.println("Мотоцикл ускоряется");

    }

    @Override
    void move() {
        super.move();
    }

    @Override
    void brake() {

    }
}
