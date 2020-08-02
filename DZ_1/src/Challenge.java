import java.util.Random;

public class Challenge {
    public static void main(String[] args) {
        Cat cat1 = new Cat(200, 2L, "Mousy");
        Dog dog1 = new Dog(500, (long) 0.5, "Hatiko");
        cat1.showInfo();
        dog1.showInfo();
        cat1.jump(cat1.getObstacleHeight());
        cat1.run(cat1.getObstacleLength());
        cat1.swim(cat1.getObstacleLength());
        /*dog1.jump(cat1.getObstacleHeight());
        dog1.run(cat1.getObstacleLength());
        dog1.swim(cat1.getObstacleLength());

         */
    }
}
