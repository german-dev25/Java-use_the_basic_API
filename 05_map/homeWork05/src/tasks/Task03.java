package tasks;

public class Task03 {
    // размер, Ферзь и пустая клетка
    private static int boardSize = 8;
    private static char Queen = 'Q';
    private static char empty = '-';

    // создаем доску
    private static void initBoar(char[][] board) {
        // строки/столбцы в массив массивов, заполненно '-'
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = empty;
            }
        }
    }

    // вывод доски
    private static void printBoard(char[][] board) {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean solve(char[][] board, int col) {
        // у нас проходит расстановка по очереди по всем col
        // для выхода из рекурсии
        if (col >= boardSize) {
            // если мы "вышли за пределы" доски, то ферзи расставлены
            return true;
        }

        // проходим по всем row
        for (int row = 0; row < boardSize; row++) {
            // проверяем
            if (safePlace(board, row, col)) {
                board[row][col] = Queen;

                if (solve(board, col + 1)) {
                    return true; // ищем решение для следующей колонки рекурсией solve
                                 // перемещаясь по доске к след col
                }

                board[row][col] = empty; // отменяем выбор, если не удалось найти решение
            }
        }
        return false; // не удалось найти решение
    }

    // прореряем безопасно ли на доске в клетке
    private static boolean safePlace(char[][] board, int row, int col) {
        // проверяем горизонталь/вертикаль
        for (int i = 0; i < boardSize; i++) {
            if (board[row][i] == Queen || board[i][col] == Queen) {
                return false;
            }
        }

        // проверяем диагонали
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if ((i + j == row + col || i - j == row - col) && board[i][j] == Queen) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void run() {
        char[][] board = new char[boardSize][boardSize];
        initBoar(board);

        if (solve(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("No sol");
        }
    }
}
