package entity;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {

    List<Sentence> paragraph = new ArrayList<Sentence>();

    public List<Sentence> getParagraph() {
        return paragraph;
    }

    public void setParagraph(List<Sentence> paragraph) {
        this.paragraph = paragraph;
    }

    public Paragraph(String paragraph) {

       }
}
