package edu.ntnu.idatx2003.capitalize;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
    private String selection = "";

    public CapitalizeSelectionTextCommand(String selection) {
        this.selection = selection;
    }


    @Override
    public String execute(String text) {
        return text.replace(selection, selection.substring(0, 1).toUpperCase() + selection.substring(1));
    }

    public String getSelection() {
        return selection;
    }

}
