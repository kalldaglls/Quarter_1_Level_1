public abstract class Animal {
    protected int obstacleLength;
    protected float obstacleHeight;
    protected String name;

    public Animal () {}

    public Animal (int obstacleLength, float obstacleHeight, String name) {
        this.obstacleLength = obstacleLength;
        this.obstacleHeight = obstacleHeight;
        this.name = name;

    }

    public int getObstacleLength() {
        return obstacleLength;
    }

    public float getObstacleHeight() {
        return obstacleHeight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "obstacleLength=" + obstacleLength +
                ", obstacleHeight=" + obstacleHeight +
                ", name='" + name + '\'' +
                '}';
    }

    public abstract void swim (int obstacleLength);

    public abstract void jump (float obstacleHeight);

    public abstract void run (int obstacleLength);

}

        /*1. Создать классы Собака и Кот с наследованием от класса Животное.
        2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
        4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
        5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

         */