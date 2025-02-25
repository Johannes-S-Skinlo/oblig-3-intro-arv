package edu.ntnu.idatx2003.wrap;
import edu.ntnu.idatx2003.TextCommand;

/**
 * Abstract class representing a command that wraps text with specified opening and ending strings.
 */
public class WrapTextCommand implements TextCommand {

    /**
     * The opening and ending strings to wrap the text with.
     */
    public String opening;
    public String end;

    /**
     * Constructs a WrapTextCommand with the specified opening and ending strings.
     *
     * @param opening the opening string
     * @param end the ending string
     */
    public WrapTextCommand(String opening, String end) {
        this.opening = opening;
        this.end = end;
    }

    /**
     * Executes the command to wrap the given text.
     *
     * @param text the text to be wrapped
     * @return the wrapped text
     */
    @Override
    public String execute(String text) {
        if (text.isEmpty()) {
            return opening + text + end;
        }
        return text;
    }

    /**
     * @return the opening string
     */
    public String getOpening() {
        return opening;
    }

    /**
     * @return the ending string
     */
    public String getEnd() {
        return end;
    }

}
