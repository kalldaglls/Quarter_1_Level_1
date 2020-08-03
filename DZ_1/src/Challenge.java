import java.util.Random;

public class Challenge {
    public static void main(String[] args) {
        Cat cat1 = new Cat(200, 2L, "Mousy");
        Dog dog1 = new Dog(500, 0.5f, "Hatiko");
        cat1.showInfo();
        dog1.showInfo();
        cat1.jump(cat1.getObstacleHeight());
        cat1.run(cat1.getObstacleLength());
        cat1.swim(cat1.getObstacleLength());
        dog1.jump(dog1.getObstacleHeight());
        dog1.run(dog1.getObstacleLength());
        dog1.swim(dog1.getObstacleLength());


    }
}
