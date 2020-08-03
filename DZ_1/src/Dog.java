import java.util.Random;

public class Dog extends Animal {
    //public Dog () {}
    public Dog(int obstacleLength, float obstacleHeight, String name) {
        super(obstacleLength, obstacleHeight, name);//Сначала всегда вызывается родительский конструктор и выполняются все операции, которые в нем находятся!

    }

    @Override
    public void swim(int obstacleLength) {
        Random random = new Random();
        double dogSwim = random.nextInt(obstacleLength);
        System.out.printf("Dog swim [%s] meters", dogSwim);
        System.out.println();
    }

    @Override
    public void jump(float obstacleHeight) {
        Random random = new Random();
        double dogJump = random.nextFloat();
        System.out.printf("Dog jumped [%s] meters", dogJump);
        System.out.println();
    }
    @Override
    public void run(int obstacleLength) {
        Random random = new Random();
        int dogRun = random.nextInt(obstacleLength);
        System.out.printf("Dog run [%s] meters", dogRun);
        System.out.println();

    }
    public void showInfo () {
        System.out.println(String.format("Contestant info: max distance - %s, max jump height - %s, name - %s", obstacleLength, obstacleHeight, name));
    }
}
