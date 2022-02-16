package Utility;

import JME.Colors;

import java.util.ArrayList;

public class Board {
    int[][] board;
    public Board() {
        board = new int[3][3];
    }

    public int[][] getBoard(){
        return board;
    }

    public void set(int playerNum, int position){
        int yPos = 0;
        if(position < 3) {
            yPos = 0;
        } else if (position < 6) {
            yPos = 1;
        } else {
            yPos = 2;
        }
        board[yPos][(position%3)] = playerNum;
    }

    public ArrayList<Integer> getValidMoves() {
        ArrayList<Integer> validMoves = new ArrayList<>();
        for (int a = 1; a <= 3; a++) {
            for (int i = 1; i <= 3; i++) {
                if(board[a-1][i-1] == 0) {
                    validMoves.add((a*3)+i - 3);
                }
            }
        }
        return validMoves;
    }

    @Override
    public String toString() {
        return String.format("""
                %1s│%1s│%1s
                ─┼─┼─
                %1s│%1s│%1s
                ─┼─┼─
                %1s│%1s│%1s""",
                correspondingStr(board[0][0]),
                correspondingStr(board[0][1]),
                correspondingStr(board[0][2]),
                correspondingStr(board[1][0]),
                correspondingStr(board[1][1]),
                correspondingStr(board[1][2]),
                correspondingStr(board[2][0]),
                correspondingStr(board[2][1]),
                correspondingStr(board[2][2]));
    }

    public static String correspondingStr(int i) {
        if(i == 1)
            return JME.Strings.stringColor("O", Colors.BLUE);
        else if(i == 2)
            return JME.Strings.stringColor("X", Colors.RED);
        return " ";
    }
}
