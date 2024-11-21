package main.java.org.example.wiseword_class.level4;

import java.util.Scanner;

public class App {

    public void run() {
        System.out.println("== 명언 앱 ==");

        Scanner scanner = new Scanner(System.in);

        int lastId = 0;

        while (true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            if (cmd.equals("exit")) {
                break;
            } else if (cmd.equals("resister")) {
                System.out.print("명언 : ");
                String content = scanner.nextLine();
                System.out.print("작가 : ");
                String author = scanner.nextLine();
                int id = ++lastId;

                WiseSaying wiseSaying = new WiseSaying();
                wiseSaying.id = id;
                wiseSaying.content = content;
                wiseSaying.author = author;

                System.out.println("%d번 명언이 등록되었습니다.".formatted(id));
            }
        }

        scanner.close();

    }
}
