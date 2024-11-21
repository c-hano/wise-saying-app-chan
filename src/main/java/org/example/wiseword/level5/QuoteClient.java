package main.java.org.example.wiseword.level5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuoteClient {

    public void run() {

        Scanner scanner = new Scanner(System.in);
        List<Quote> quotes = new ArrayList<Quote>();
        int count = 1;

        System.out.println("== 명언 앱 ==");

        while (true) {

            System.out.print("명령) ");
            String command = scanner.nextLine();

            if (command.equals("등록")) {

                System.out.print("명언 : ");
                String content = scanner.nextLine().trim();
                System.out.print("작가 : ");
                String author = scanner.nextLine().trim();

                if (author.isEmpty()) {
                    author = "작자미상";
                }

                quotes.add(new Quote(content, author, count));

                count++;
            } else if (command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("---------------------");

                for (int i = quotes.size() - 1; i >= 0; i--) {
                    Quote quote = quotes.get(i);
                    System.out.println(quote);
                }
            } else if (command.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("잘못된 접근입니다.");
            }
        }
    }
}
