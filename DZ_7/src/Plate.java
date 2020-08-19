import java.sql.SQLOutput;
import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n, boolean m, String name) {
        if (food >= n) {
            food -= n;
            m = true;
            System.out.println(name + " " + "is full" + " " + m);
        }
        else {
            while (food < n) {
                m = false;
                System.out.println(name + " " + "can't eat:too little food!" + " " + m);//1. Как вставить getAppetite?2. Как заставить plate после
                //eat в этом случае не показываться?
                Scanner scanner = new Scanner(System.in);
                System.out.println("Want you fill the plate for" + " " + name + "?");
                if (scanner.nextLine().equals("yes")) {
                    fillPlate();//Как можно после fillPlate опять по
                    info();
                } else break;
                if (food >= n) {
                    food -= n;
                    m = true;
                    System.out.println(name + " " + "is full" + " " + m);
                    break;
                }
            }

        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public void fillPlate () {
            food += 10;
    }
}

