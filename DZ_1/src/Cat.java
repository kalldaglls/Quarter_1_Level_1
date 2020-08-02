import java.util.Random;

public class Cat extends Animal {

    public Cat(int obstacleLength, long obstacleHeight, String name) {
        super(obstacleLength, obstacleHeight, name);//Сначала всегда вызывается родительский конструктор и выполняются все операции, которые в нем находятся!

    }

    @Override
    public void swim(int obstacleLength) {
        System.out.printf("[%s] can't swim as all other cats!", super.name);

    }

    @Override
    public void jump(long obstacleHeight) {
        Random random = new Random();
        double catJump = random.nextLong();
        System.out.printf("Cat jumped [%s] meters", catJump);
    }
    @Override
    public void run(int obstacleLength) {
        Random random = new Random();
        int catRun = random.nextInt(obstacleLength);
        System.out.printf("Cat run [%s] meters", catRun);

    }

    public void showInfo () {
        System.out.println(String.format("Contestant info: max distance - %s, max jump height - %s, name - %s", obstacleLength, obstacleHeight, name));
    }


    // Animal cat = new Animal(200, 2);// Как прочитать эту строку? Объект cat типа Animal является новым объектом типа Animal?
}
