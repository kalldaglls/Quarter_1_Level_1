import java.util.Random;
import java.util.Scanner;

public class TicTac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // Создаем игровое поле
        String [][] field = new String[][] {
                {"-", "-", "-" },
                {"-", "-", "-" },
                {"-", "-", "-" }
        };
        //Создаем рандомный выбор координат для AI


        //создаем цикл для ввода данных пользователем и AI
        do { int xVal;
             int yVal;
                // Просим пользователя ввести координаты X и Y
                System.out.println("Введите координату x");
                xVal = scanner.nextInt();
                System.out.println("Введите координату y");
                yVal = scanner.nextInt();
                //Присваеваем элементу массива введенные пользователем координаты и передаем туда X
                field[xVal][yVal] = "X";
            if ((field[xVal][yVal]).equals("-")) {
                for (int i = 0; i <= field.length - 1; i++) {
                    for (int j = 0; j <= field.length - 1; j++) {
                        System.out.print(field[i][j]);
                    }
                    System.out.println();
                }
            } else System.out.println("Данное поле занято!");
                // Просим AI ввести координаты X и Y
            if ((field[xVal][yVal]).equals("-")) {
                System.out.println("Компьютер выбирает координату x");
                xVal = random.nextInt(field.length - 1);
                System.out.println("Компьютер выбирает координату y");
                yVal = random.nextInt(field.length - 1);
                //Присваеваем элементу ма   ссива введенные пользователем координаты и передаем туда X
                field[xVal][yVal] = "Y";
                for (int i = 0; i <= field.length - 1; i++) {
                    for (int j = 0; j <= field.length - 1; j++) {
                        System.out.print(field[i][j]);
                    }
                    System.out.println();
                }
            }else System.out.println("Данное поле занято!");
        } while (true);

        //String signAI = "Y";
       // field [0] [0] = signAI;
       //System.out.println(field[0][0]);

    }
}
