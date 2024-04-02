package src;

import src.Actions.Action;

import java.util.List;


/**
 * Interface for objects that can perform actions.
 */
public interface ActionCapable {

    /**
     * Getter for the list of allowable actions.
     * @return List of allowable actions.
     */
    public List<Action> allowableActions();
}
