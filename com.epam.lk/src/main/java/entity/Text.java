package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    String stringText;
    List<Paragraph> paragraphs;

    public Text(String stringText) {
        paragraphs = new ArrayList<>();
        this.stringText = stringText;
        paragraphs.addAll(Parser.parseParagraphs(stringText));
    }

    @Override
    public String toString() {
        return paragraphs.toString();
    }

    public void addParagraph(Paragraph paragraph) {
        paragraphs.add(paragraph);
    }
}
