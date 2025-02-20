package oblig3.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand{

    private String selection = "";

    public WrapSelectionTextCommand(String opening, String end, String selectedtion) {
        super(opening, end); // Call the parent constructor
        this.opening = opening;
        this.end = end;
        this.selection = selectedtion;
    }

    @Override
    public String execute(String text) {
        return opening + selection + end;
    }

    public String getSelection () {
        return selection;
    }

}