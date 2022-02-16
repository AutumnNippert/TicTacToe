import Controllers.Controller;
import Utility.Board;

public class Game {
    private final Controller c1;
    private final Controller c2;
    private final Board board;
    public Game(Controller c1, Controller c2){
        this.c1 = c1;
        this.c2 = c2;
        this.board = new Board();
    }

    public void _init() {
        int winner = 0;
        Controller currentController = c1;
        while(winner == 0) {
            int position;
            do{
                JME.ConsoleFunctions.cls();
                System.out.println(board);

                position = currentController.selectPosition(board);
            } while(!board.getValidMoves().contains(position));

            board.set(currentController.controllerNumber, position-1);
            currentController = (currentController == c1) ? c2 : c1;
            winner = checkWin();
        }
        JME.ConsoleFunctions.cls();
        System.out.println(board);
        System.out.println("Winner is player " + winner);
        JME.ConsoleFunctions.waitForInput();
    }

    private int checkWin(){
        int[][] boardValues = board.getBoard();
        //horizontal check
        for (int a = 0; a < 3; a++) {
            if(boardValues[a][0] == boardValues[a][1] && boardValues[a][0] == boardValues[a][2])
                return boardValues[a][0];
        }
        //vertical check
        for (int a = 0; a < 3; a++) {
            if(boardValues[0][a] == boardValues[1][a] && boardValues[0][a] == boardValues[2][a])
                return boardValues[0][a];
        }
        //diagonal checks
        if (boardValues[0][0] == boardValues[1][1] && boardValues[0][0] == boardValues[2][2])
            return boardValues[0][0];
        if (boardValues[2][0] == boardValues[1][1] && boardValues[2][0] == boardValues[0][2])
            return boardValues[2][0];
        return 0;
    }
}