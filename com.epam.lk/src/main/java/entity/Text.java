package entity;

import java.util.ArrayList;
import java.util.List;

public class Text {

    List<Paragraph> text = new ArrayList<Paragraph>();

    public List<Paragraph> getText() {
        return text;
    }

    public void setText(List<Paragraph> text) {
        this.text = text;
    }

    public Text(List<Paragraph> text) {

        this.text = text;
    }

}
