public class Cat {
    private String name;
    private int appetite;
    private boolean full;//1. Как проверять на full?
    public Cat(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;
    }
    public void eat(Plate p) {//Причем здесь объект типа Plate?
        p.decreaseFood(appetite, full, name);
    }
    /*
    public void checkFull (int full) {

    }

     */

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }
}

