package main.java.org.example.wiseword.level5.retry;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            List<Quote1> quotes = new ArrayList<>();
            int count = 1;

            System.out.println("== 명언 앱 ==");

            while(true) {

                System.out.print("명렁 ) ");

                String command = scanner.nextLine().trim();

                if (command.equals("등록")) {

                    System.out.print("명언 : ");
                    String content = scanner.nextLine().trim();
                    System.out.print("작가 : ");
                    String author = scanner.nextLine().trim();

                    if (author.isEmpty()) {
                        author = "작가미상";
                    }

                    quotes.add(new Quote1(content, author, count));
                    count ++;
                } else if (command.equals("목록")) {

                    System.out.println("번호 / 작가 / 명언");
                    System.out.println("----------------------");

                    for (int i = quotes.size() -1 ; i >= 0 ; i--) {

                        Quote1 quote = quotes.get(i);
                        quote.printQuote(quote);

                    }
                } else if (command.equals("종료")) {

                    System.out.println("프로그램을 종료합니다.");
                    break;
                }	else {

                    System.out.println("잘못된 접근입니다.");

                }
            }

            scanner.close();
        }

    }

