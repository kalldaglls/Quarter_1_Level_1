import java.sql.SQLOutput;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n, boolean m , String name) {
        if (food >= n) {
            food -= n;
            m = true;
            System.out.println(name + " " + "is full" + " " + m);
        }
        else {
            System.out.println(name + " " + "can't eat:too little food!");//1. Как вставить getAppetite?2. Как заставить plate после
            //eat в этом случае не показываться?
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}

