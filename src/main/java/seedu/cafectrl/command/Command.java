package seedu.cafectrl.command;

import seedu.cafectrl.data.Menu;
import seedu.cafectrl.data.Pantry;
import seedu.cafectrl.ui.Ui;

/**
 * Represents an executable command.
 */
public class Command {

    public int index;

    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * check whether this command is an exit command (user input "bye")
     *
     * default returns false, this method will be overridden in ExitCommand
     */
    public boolean isExit() {
        return false;
    }

    /**
     * Executes the command and returns the result.
     */
    public void execute(Menu menu, Ui ui, Pantry pantry) {
        throw new UnsupportedOperationException("This method is to be implemented by child classes");
    };
}
