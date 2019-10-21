package by.epam.javaintro.classes.task02;

import java.util.LinkedList;
import java.util.Objects;

public class Sentence {
    private LinkedList<Word> words;

    public Sentence() {
        this.words = new LinkedList<>();
    }

    public Sentence(LinkedList<Word> words) {
        this();
        for (int i = 0; i < words.size(); i++) {
            this.words.add(words.get(i));
        }
    }

    public void setWords(LinkedList<Word> words) {
        for (int i = 0; i < words.size(); i++) {
            this.words.add(words.get(i));
        }
    }

    public LinkedList<Word> getWords() {
        return words;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(words, sentence.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                words +
                '}';
    }
}
