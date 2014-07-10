package entity;

import java.util.List;

public class Text {
    public Text(String stringText, List<Paragraph> paragraphs) {
        this.stringText = stringText;
        this.paragraphs = paragraphs;
    }


    private String stringText;
    private List<Paragraph> paragraphs;

    public String getStringText() {
        return stringText;
    }

    public void setStringText(String stringText) {
        this.stringText = stringText;
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }
}
