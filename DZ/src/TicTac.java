import java.util.Random;
import java.util.Scanner;

public class TicTac {
    public static void main(String[] args) {
        int b = 1;
        char[][] field = initField();
        final char playerSign = 'X';
        final char AISign = 'Y';
        String winnerName;
        do {
            doPlayerMove(field, playerSign);

            if (checkWin(field,playerSign)) {
                winnerName = "Пользователь";
                System.out.println(winnerName + " " + "победил!");
                break;
            }

            for (int i = 0; i <= field.length - 1; i++) {
                for (int j = 0; j <= field[i].length - 1; j++) {
                    System.out.print(field[i][j]);//почему так пишем?
                }
                System.out.println();
            }

            doAIMove(field,AISign);

            if (checkWin(field,AISign)) {
                winnerName = "Компьютер";
                System.out.println(winnerName + " " + "победил!");
                break;
            }

            for (int i = 0; i <= field.length - 1; i++) {
                for (int j = 0; j <= field[i].length - 1; j++) { //Почему здесь field[i]?
                    System.out.print(field[i][j]);
                }
                System.out.println();
            }
            b++;
        } while (b < 4);
        System.out.println("Ничья!");
    }

    //String signAI = "Y";
    // field [0] [0] = signAI;
    //System.out.println(field[0][0]);

    static void doPlayerMove (char [][] field, char sign){
        Scanner scanner = new Scanner(System.in);
        int xVal, yVal;//Оказывается можнл сразу несколько задавать!
        // Просим пользователя ввести координаты X и Y
        System.out.println("Введите координату x");
        xVal = scanner.nextInt() - 1;
        System.out.println("Введите координату y");
        yVal = scanner.nextInt() - 1;
        while (xVal < 0 || xVal > 2 || yVal < 0 || yVal > 2) {
            System.out.println("Вы ввели число не из требуемого диапазона! Введите число от 1 до 3!");
            System.out.println("Введите координату x");
            xVal = scanner.nextInt() - 1; // Можно scanner пользователя и random компа объединить в один метод?
            System.out.println("Введите координату y");
            yVal = scanner.nextInt() - 1;
        }
        while (field[xVal][yVal] != '-') {//почему "не равно" пишется не "!=="Б, а "!="?
            System.out.println(String.format("Field[%s][%s] уже занято", xVal + 1, yVal + 1));
            System.out.println("Введите координату x");
            xVal = scanner.nextInt() - 1; // Можно scanner пользователя и random компа объединить в один метод?
            System.out.println("Введите координату y");
            yVal = scanner.nextInt() - 1;
        }
        //Присваеваем элементу массива введенные пользователем координаты и передаем туда X
        field[xVal][yVal] = sign; // Сделать для игрока и компа xVal и yVal в разных методах?
        //if ((field[xVal][yVal]).equals("-")) {

    }
    static void doAIMove (char [][] field, char sign) {
        // } else System.out.println("Данное поле занято!");
        // Просим AI ввести координаты X и Y
        int xVal, yVal;//Оказывается можнл сразу несколько задавать!
        Random random = new Random();
        System.out.println("Компьютер выбирает координату x");
        xVal = random.nextInt(field.length);
        System.out.println("Компьютер выбирает координату y");
        yVal = random.nextInt(field.length);
        System.out.println("Координата x:" + " " + (xVal + 1));
        System.out.println("Координата y:" + " " + (yVal + 1));
        while (field[xVal][yVal] != '-') {
            System.out.println(String.format("Field[%s][%s] уже занято", (xVal + 1), (yVal + 1)));
            System.out.println("Компьтер повторяет ввод координаты x");
            xVal = random.nextInt(field.length);
            System.out.println("Компьтер повторяет ввод координаты y");
            yVal = random.nextInt(field.length);
        }
        //Присваеваем элементу массива введенные пользователем координаты и передаем туда X
        field[xVal][yVal] = sign;
    }

    static char[][] initField() {
        return new char[][]{//как сделать пробелы между элементами, не вводя новые елементы в массив?
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'},

        };
    }

    static boolean checkWin(char[][] field, char sign) {
        for (int i = 0; i <= field.length - 1; i++) {
            if ((field[i][0] == sign && field[i][1] == sign && field[i][2] == sign) || (field[0][i] == sign && field[1][i] == sign && field[2][i] == sign)) {
                return true;
            }
        }
        return false;
    }
}
