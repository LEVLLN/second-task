package entity;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    private static final String regexParagraph = "\\n+";
    private static final String regexSentence = "(?<=[.?!])(?:\\s+)";//(\S)
    private static final String regexWord = "((\\b[^\\s0-9]+\\b)((?<=\\.\\w).)?)";
    private static final String regexChar = "";

    public static List<Paragraph> parseParagraphs(String text) {
        String[] lines = text.split(regexParagraph);
        List<Paragraph> paragraphs = new ArrayList<>();
        for (String line : lines) {
            paragraphs.add(new Paragraph(line));
        }
        return paragraphs;
    }

}
