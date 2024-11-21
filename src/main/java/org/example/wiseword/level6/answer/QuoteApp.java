package main.java.org.example.wiseword.level6.answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuoteApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Quote> quotes = new ArrayList<>();
        int idCounter = 1;

        while (true) {
            System.out.print("명령) ");
            String command = scanner.nextLine();

            if (command.equals("등록")) {
                System.out.print("명언 : ");
                String quoteText = scanner.nextLine();
                System.out.print("작가 : ");
                String author = scanner.nextLine();
                quotes.add(new Quote(idCounter, quoteText, author));
                System.out.println(idCounter + "번 명언이 등록되었습니다.");
                idCounter++;

            } else if (command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for (int i = quotes.size() - 1; i >= 0; i--) {
                    System.out.println(quotes.get(i));
                }

            } else if (command.startsWith("삭제")) {
                String[] parts = command.split("=");
                if (parts.length == 2 && parts[0].equals("삭제?id")) {
                    int idToDelete = Integer.parseInt(parts[1]);
                    boolean found = false;
                    for (int i = 0; i < quotes.size(); i++) {
                        if (quotes.get(i).id == idToDelete) {
                            quotes.remove(i);
                            System.out.println(idToDelete + "번 명언이 삭제되었습니다.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("해당 ID의 명언이 없습니다.");
                    }
                } else {
                    System.out.println("명령어 형식이 올바르지 않습니다. 예: 삭제?id=1");
                }

            } else if (command.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("알 수 없는 명령입니다.");
            }
        }

        scanner.close();
    }

}
