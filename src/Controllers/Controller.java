package Controllers;

import Utility.Board;

/**
 * Abstract Controllers.Controller Class.
 * It can't exist on its own, but it can have sub-classes that can, like Controllers.Player and AI.
 * This class defines some generic things that Players and AI have in common.
 * @author Chris Nippert
 * @version 0.1
 */
public abstract class Controller {

    public int controllerNumber;

    /**
     * Constructs the controller.
     *
     */
    public Controller(int controllerNumber) { this.controllerNumber = controllerNumber; }

    public abstract int selectPosition(Board board);
}
