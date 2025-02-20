package oblig3.capitalize;
import oblig3.TextCommand;

public class CapitalizeTextCommand implements TextCommand {

    @Override
    public String execute(String text) {
        return text.toUpperCase();
    }

}
