public class TicTacToe {
    public static void main(String[] args) {

    }
    static void start() {
        char [][] field = initField();
    }

    static void drawField (char [][] field) {
        for (int i = 0; i <= field.length - 1; i++) {
            for (int j = 0; j <= field[i].length - 1; j++) {
                System.out.print(field[i]);
            }
            System.out.println();
        }
    }
    static char[][] initField() {
        return new char [][] {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'},
        };
    }
}
