package org.example;

import java.util.Scanner;

public class Main {

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
        long population = 890000000000L;

        double height = 169.4;
        float weight = 70.5f;

        char ch = '3';

        //출력
        System.out.println("Age: " + age);

        //명시적 형 변환(타입 캐스팅): 큰 타입에서 작은 타입으로 수동 변환
        double pi = 3.14;
        int truncatedPi = (int) pi;

        System.out.println("pi: " + pi + ", truncatedPi: " + truncatedPi);

        //연산자
        //산술연산자: + - * / %
        //비교연산자: == != < > <= >=
        //논리연산자: && || !

        //수를 입력 받아 홀수인지 짝수인지 판별하는 프로그램
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");

            if (num <10) System.out.println(num + "은 한자리 숫자입니다.");
            else if (num <100) System.out.println(num + "은 두자리 숫자입니다.");
            else if (num <1000) System.out.println(num + "은 세자리 숫자입니다.");

            //switch
            switch(num) {
                case 1: System.out.println("일");
                    break;
                case 2: System.out.println("둘");
                    break;
                default :
                    System.out.println("아무것도 아님");
                    break;


            }
        }
    }
}
