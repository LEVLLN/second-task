package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

    List<Paragraph> text = new ArrayList<Paragraph>();


    public List<Paragraph> getText() {
        return text;
    }

    public void setText(List<Paragraph> text) {
        this.text = text;
    }

    public Text(String text) {

        this.text = text;
    }

}
