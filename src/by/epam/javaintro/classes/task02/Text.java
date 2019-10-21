// 2. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.

package by.epam.javaintro.classes.task02;

import java.util.LinkedList;
import java.util.Objects;

public class Text {
    private LinkedList<Sentence> sentences;
    private Word title;

    public Text() {
        this.sentences = new LinkedList<>();
        this.title = new Word();
    }

    public Text(LinkedList<Sentence> sentences, Word title) {
        this.sentences = new LinkedList<>();
        for (int i = 0; i < sentences.size(); i++) {
            this.sentences.add(sentences.get(i));
        }
        this.title = title;
    }

    public void setSentences(LinkedList<Sentence> sentences) {
        for (int i = 0; i < sentences.size(); i++) {
            this.sentences.add(sentences.get(i));
        }
    }

    public void setTitle(Word title) {
        this.title = title;
    }

    public LinkedList<Sentence> getSentences() {
        return sentences;
    }

    public Word getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(sentences, text.sentences) &&
                Objects.equals(title, text.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentences, title);
    }

    @Override
    public String toString() {
        return "\t\t\t\t\t\t" + title + "\n" + sentences;
    }
}
