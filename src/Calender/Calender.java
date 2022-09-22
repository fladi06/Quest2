package Calender;

import java.util.Calendar;
import java.util.Scanner;

import static java.util.Calendar.*;

public class Calender {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Calendar cal = getInstance();

        System.out.println("[달력 출력 프로그램]");
        int yy = 0;
        int mm = 0;


        System.out.printf("달력의 년도를 입력해 주세요.(yyyy) : ");
        yy = input.nextInt();
        System.out.printf("달력의 월을 입력해 주세요.(mm) : ");
        mm = input.nextInt();

        cal.set(YEAR, yy);
        cal.set(MONTH, mm);

        System.out.println(String.format("[%02d년 %02d월]", yy,mm));
        System.out.println("\t[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]");

        cal.set(yy,mm-1,1);

        int endDay = cal.getActualMaximum(DATE);
        int week = cal.get(DAY_OF_WEEK);

        for (int i = 1; i <= endDay; i++){
            if (i == 1) {
                for (int j = 1; j < week; j++) {
                    System.out.printf(String.format("\t"));
                }
            }
            if(i<10) {
                System.out.print(String.format(" "));
            }
            System.out.printf("\t"+i+"\t");
            if(week%7 == 0) {
                System.out.println();
            }
            week++;
        }
        System.out.println();
    }
}

