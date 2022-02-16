package Controllers;

import JME.Menu.HorizontalMenu;
import Utility.Board;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Controllers.Player Class
 * Deals with the Controllers.Player and its actions
 * Everything the Controllers.Player class does is interact with what the player can see (like the board)
 *
 * @author Chris Nippert
 * @version 0 (unreleased)
 */
public class Player extends Controller {

    public Player(int controllerNumber) { super(controllerNumber); }

    @Override
    public int selectPosition(Board board) {
        ArrayList<Integer> validMoves = board.getValidMoves();
        Collections.sort(validMoves);
        HorizontalMenu<Integer> selectionMenu = new HorizontalMenu<>("Select where you would like to play.", validMoves);
        selectionMenu.display();
        return Integer.parseInt(selectionMenu.getInput(">>> "));
    }
}