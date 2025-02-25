package edu.ntnu.idatx2003.wrap;

import java.util.List;

import edu.ntnu.idatx2003.TextCommand;

public class Script {
    private List<TextCommand> textCommands;

    public Script(List<TextCommand> textCommands) {
        this.textCommands = textCommands;
    }

    public String excecute(String text) {
        for (TextCommand command : textCommands) {
            text = text + command.execute(text);
        }
        return text;
    }
}
