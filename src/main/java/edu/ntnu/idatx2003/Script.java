package edu.ntnu.idatx2003;

import java.util.List;

public class Script {
    private List<TextCommand> textCommands;

    public Script(List<TextCommand> textCommands) {
        this.textCommands = textCommands;
    }

    public String excecute(String text) {
        for (TextCommand textcommand : textCommands) {
            text = text + "\n" + textcommand.execute(text);
        }
        text = text.replaceFirst("\n", "");
        return text;
    }
}
