package edu.ntnu.idatx2003.wrap;

/**
 * The WrapLinesTextCommand class is responsible for wrapping text with specified opening and ending strings.
 * It extends the WrapTextCommand class.
 */
public class WrapLinesTextCommand extends WrapTextCommand{

    /**
     * Constructs a new WrapLinesTextCommand with the specified opening and ending strings.
     *
     * @param opening the string to be added at the beginning of the text
     * @param end the string to be added at the end of the text
     */
    public WrapLinesTextCommand(String opening, String end) {
        super(opening, end); // Call the parent constructor
        this.opening = opening;
        this.end = end;
    }

    /**
     * Executes the command to wrap the given text with the opening and ending strings.
     *
     * @param text the text to be wrapped
     * @return the wrapped text
     */
    @Override
    public String execute(String text) {
        if (text.isEmpty()){
            return text;
        }
        else if (text.contains("\n")) {
            for (int i = 0; i < text.length(); i++) {
                if (!text.substring(i + 1).isEmpty()) {
                    text = text.substring(0, i) + end + "\n" + opening + text.substring(i + 1);
                }
            }
        }
        return opening + text + end;
    }
}
