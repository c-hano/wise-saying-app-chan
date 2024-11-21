package main.java.org.example.wiseword.level5.retryUseSwitch;

public class Quote1 {

    private String content;
    private String author;
    private int quoteId;

    public Quote1 (String content, String author, int quoteId) {
        this.content = content;
        this.author = author;
        this.quoteId = quoteId;
    }

    public void printQuote (Quote1 quote) {

        System.out.println(quoteId + " / " + author + " / " + content);
    }
}
