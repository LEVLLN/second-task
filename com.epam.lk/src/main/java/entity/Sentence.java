package entity;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    List<Word> sentence = new ArrayList<Word>();

    public List<Word> getSentence() {
        return sentence;
    }

    public void setSentence(List<Word> sentence) {
        this.sentence = sentence;
    }

    public Sentence(List<Word> sentence) {

        this.sentence = sentence;
    }
}
