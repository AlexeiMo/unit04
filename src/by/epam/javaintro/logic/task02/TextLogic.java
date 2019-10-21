package by.epam.javaintro.logic.task02;
import by.epam.javaintro.classes.task02.*;

public class TextLogic {
    private Text text;

    public TextLogic(Text text) {
        this.text = text;
    }

    public Text fillText(Sentence sent) {
        text.getSentences().add(sent);
        return text;
    }

    public void printText() {
        System.out.println(text.toString());
    }

    public void printTitle() {
        System.out.println(text.getTitle().toString());
    }

}