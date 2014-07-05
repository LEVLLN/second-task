package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public static Text parseText(String subText) {
        String textStr = clean(subText);
        Text text = new Text(textStr);
        return text;
    }

    public static List<Paragraph> parseParagraphs(String submittedText) {
        String textStr = safe(submittedText);
        String lines[] = textStr.split("\\n+");
        List<Paragraph> pars = new ArrayList<>();
        for (String line : lines) {
            pars.add(new Paragraph(line));
        }
        return pars;
    }
    public static String clean(String textStr) {
        textStr = textStr.replaceAll("<|>|\\t|\\s+", " ");
        return textStr;
    }

    public static String safe(String textStr) {
        textStr = textStr.replaceAll("<|>", " ");
        return textStr;
    }


}
