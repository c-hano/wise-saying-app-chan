package main.java.org.example.wiseword.level4;

import java.util.Scanner;

public class Level4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;

        System.out.println("== 명언 앱 ==");


        while (true) {

            System.out.print("명령) ");
            String n = scanner.nextLine();

            if (n.equals("end")) {

                break;

            } else if (n.equals("resister")) {
                System.out.print("명언 : ");
                scanner.nextLine();
                System.out.print("작가 : ");
                scanner.nextLine();
                System.out.println(count + "번 명언이 등록되었습니다.");
                count++;
            }
        }

    }
}
