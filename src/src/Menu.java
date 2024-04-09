package src;

import src.Actions.Action;

import java.util.*;


/**
 * Class for the Menu.
 */
public class Menu {

    /**
     * Method to show the menu.
     * @param actions List of actions.
     * @return Action.
     */
    public static Action showMenu(List<Action> actions) {
        Scanner scanner = new Scanner(System.in);
        List<Character> freeChars = new ArrayList<Character>();
        Map<Character, Action> keyToActionMap = new HashMap<>();


        for (char j = 'a'; j <= 'z'; j++) {
            freeChars.add(j);
        }


        for (Action action : actions) {
            char c = freeChars.get(0);
            freeChars.remove(Character.valueOf(c));
            keyToActionMap.put(c, action);
            System.out.println(c + ": " + action.menuDescription());
        }


        char key;
        do {
            key = scanner.next().charAt(0);
        } while (!keyToActionMap.containsKey(key));


        return keyToActionMap.get(key);
    }
}