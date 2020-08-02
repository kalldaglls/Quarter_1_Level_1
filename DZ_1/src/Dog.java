public class Dog extends Animal {
    //public Dog () {}
    public Dog(int obstacleLength, long obstacleHeight, String name) {
        super(obstacleLength, obstacleHeight, name);//Сначала всегда вызывается родительский конструктор и выполняются все операции, которые в нем находятся!

    }

    @Override
    public void jump(long obstacleHeight) {

    }

    @Override
    public void run(int obstacleLength) {

    }

    @Override
    public void swim(int obstacleLength) {

    }
    public void showInfo () {
        System.out.println(String.format("Contestant info: max distance - %s, max jump height - %s, name - %s", obstacleLength, obstacleHeight, name));
    }
}
