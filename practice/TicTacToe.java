package practice;
import java.util.Scanner;
/**
 * @author Coco
 *
 * 井字游戏
 *
 * 读入一个3*3的矩阵，矩阵中数字为1则表示该位置上有一个X，为0则表示有一个O
 *
 * 判断这个矩阵中是否有获胜的一方，输出X或O，或输出无人获胜
 */
public class TicTacToe {


    private Scanner input = new Scanner(System.in);

    // new一个3行3列的矩阵
    private final int rowSize = 3;
    private final int colSize = 3;
    private int[][] board = new int[rowSize][colSize];

    // 初始化游戏结果
    private boolean gotResult = false;
    private int numOfX = 0;
    private int numOfO = 0;

    // 读入矩阵
    public int[][] readMatrix() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = input.nextInt();
            }
        }
        return board;
    }

    // 检查行
    public boolean checkRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            numOfX = 0;
            numOfO = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    numOfX ++;
                } else {
                    numOfO ++;
                }
            }
            if (numOfX == matrix.length || numOfO == matrix.length) {
                gotResult = true;
                break;
            }
        }
        return gotResult;
    }

    // 检查列
    public boolean checkCols(int[][] matrix) {
        if (!gotResult) {
            for (int i = 0; i < matrix.length; i++) {
                numOfX = 0;
                numOfO = 0;
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[j][i] == 1) {
                        numOfX++;
                    } else {
                        numOfO++;
                    }
                }
                if (numOfX == matrix.length || numOfO == matrix.length) {
                    gotResult = true;
                    break;
                }
            }
        }
        return gotResult;
    }

    // 检查对角线
    public boolean checkDiagonal(int[][] matrix) {
        if (!gotResult) {
            numOfX = 0;
            numOfO = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][i] == 1) {
                    numOfX ++;
                } else {
                    numOfO ++;
                }
            }
            if (numOfX == matrix.length || numOfO == matrix.length) {
                gotResult = true;
            }
        }
        return gotResult;
    }

    // 检查反对角线
    public boolean checkAntiDiagonal(int[][] matrix) {
        if (!gotResult) {
            numOfX = 0;
            numOfO = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][matrix.length-i-1] == 1) {
                    numOfX ++;
                } else {
                    numOfO ++;
                }
                if (numOfX == matrix.length || numOfO == matrix.length) {
                    gotResult = true;
                }
            }
        }
        return gotResult;
    }

    // 输出获胜方
    public String getWinner(int[][] matrix) {
        String winner = "no one win";
        if (checkRows(matrix) || checkCols(matrix) || checkDiagonal(matrix) || checkAntiDiagonal(matrix)) {
            if (numOfX == matrix.length) {
                winner = "Winner is X";
            } else if (numOfO == matrix.length) {
                winner = "Winner is O";
            }
        }
        return winner;
    }



    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        System.out.println(ticTacToe.getWinner(ticTacToe.readMatrix()));
    }
}