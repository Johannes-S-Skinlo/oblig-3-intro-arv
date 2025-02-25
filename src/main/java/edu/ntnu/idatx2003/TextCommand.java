package edu.ntnu.idatx2003;

/**
 * The TextCommand interface provides a method for executing a command on a given text.
 */
public interface TextCommand {

    /**
     * Executes a command on the given text.
     *
     * @param text the text to be processed
     * @return the processed text
     */
    public abstract String execute(String text);

}
