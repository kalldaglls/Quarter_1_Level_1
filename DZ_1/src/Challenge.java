import java.util.Random;

public class Challenge {
    public static void main(String[] args) {
        Random random = new Random();
        Cat cat1 = new Cat(200, 2L, "Mousy");
        Dog dog1 = new Dog(500, 0.5f, "Hatiko");
        cat1.showInfo();
        dog1.showInfo();
        int a = random.nextInt(3);
        if (a == 1) {
            cat1.jump(cat1.getObstacleHeight());
            dog1.jump(dog1.getObstacleHeight());
        }
        else if (a == 2) {
            cat1.run(cat1.getObstacleLength());
            dog1.run(dog1.getObstacleLength());
        }
        else if (a == 3) {
            cat1.swim(cat1.getObstacleLength());
            dog1.swim(dog1.getObstacleLength());
        }
        else System.out.println("Challenge didn't happen!");
        // cat1.jump(cat1.getObstacleHeight());
        //cat1.run(cat1.getObstacleLength());
       // cat1.swim(cat1.getObstacleLength());
       // dog1.jump(dog1.getObstacleHeight());
        //dog1.run(dog1.getObstacleLength());
       // dog1.swim(dog1.getObstacleLength());


    }
}
