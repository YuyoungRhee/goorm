package JavaEx01;

import java.util.Scanner;

public class javaEx01 {

    public static void main(String[] args) {
        //콘솔 출력
        System.out.println("Hello, Java!"); //줄바꿈 o
        System.out.print("Enter your name: "); //줄바꿈 x

        //콘솔 입력
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // nextInt(), nextDouble()

        System.out.println("Welcome, " + name + "! ");

        //변수
        int age = 24;

        //출력
        System.out.println("Age: " + age);
    }
}
