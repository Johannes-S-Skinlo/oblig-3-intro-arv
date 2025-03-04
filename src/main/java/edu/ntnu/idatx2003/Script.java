package edu.ntnu.idatx2003;

import java.util.List;

public class Script {
    private List<TextCommand> textCommands;

    public Script(List<TextCommand> textCommands) {
        this.textCommands = textCommands;
    }

    public String execute(String text) {
        for (TextCommand textcommand : textCommands) {
            text = textcommand.execute(text);
        }
        return text;
    }
}
