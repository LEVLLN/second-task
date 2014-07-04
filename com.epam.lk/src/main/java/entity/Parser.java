package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public static List<Text> parseText(String submittedText) {
        List<Text> letters = new ArrayList<>();
        String textStr = clean(submittedText);
        Pattern p = Pattern.compile("[а-яА-ЯёЁa-zA-Z]");
        Matcher m = p.matcher(textStr);
        while (m.find()) {
            String[] group = m.group().split("\\s");
            for (String line : group) {
                letters.add(new Text(line));
            }
        }
        return letters;
    }
    public static String clean(String textStr) {
        textStr = textStr.replaceAll("<|>|\\t|\\s+", " ");
        return textStr;
    }
}
