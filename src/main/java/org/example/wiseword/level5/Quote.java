package main.java.org.example.wiseword.level5;

public class Quote {

    String content;
    String author;
    int quoteId;

    public Quote(String content, String author, int quoteId) {

        this.content = content;
        this.author = author;
        this.quoteId = quoteId;

    }

    @Override
    public String toString() {
        return quoteId +
                " / " + author + " / " + content;
    }
}
