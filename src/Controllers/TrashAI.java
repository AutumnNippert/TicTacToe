package Controllers;

import Utility.Board;

import java.util.ArrayList;

/**
 * Controllers.Player Class
 * Deals with the Controllers.Player and its actions
 * Everything the Controllers.Player class does is interact with what the player can see (like the board)
 *
 * @author Chris Nippert
 * @version 0 (unreleased)
 */
public class TrashAI extends Controller {

    public TrashAI(int controllerNumber) { super(controllerNumber); }

    @Override
    public int selectPosition(Board board) {
        ArrayList<Integer> validMoves = board.getValidMoves();
        return validMoves.get(JME.Numbers.randInt(0, validMoves.size()-1));
    }
}