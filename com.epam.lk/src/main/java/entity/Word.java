package entity;

import java.util.ArrayList;
import java.util.List;

public class Word {
List<Symbol> word = new ArrayList<Symbol>();

    public List<Symbol> getWord() {
        return word;
    }

    public void setWord(List<Symbol> word) {
        this.word = word;
    }

    public Word(List<Symbol> word) {

        this.word = word;
    }

}
