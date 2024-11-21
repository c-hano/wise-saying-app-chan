package main.java.org.example.wiseword.level6.answer;

public class Quote {

    int id;
    String quote;
    String author;

    public Quote(int id, String quote, String author) {
        this.id = id;
        this.quote = quote;
        this.author = author;
    }

    @Override
    public String toString() {
        return id + " / " + author + " / " + quote;
    }

}
