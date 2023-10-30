import time.MyTime;

public class Main {
    public static void main(String[] args) {
        MyTime time = new MyTime();
        System.out.println(time);
        System.out.println(time.previousSecond());
        System.out.println(time.previousMinute());
        System.out.println(time.previousHour());
        System.out.println(time.nextSecond());
        System.out.println(time.nextMinute());
        System.out.println(time.nextHour());
        System.out.println("----------------------");
        time.setTime(23, 59, 59);
        System.out.println(time);
        System.out.println(time.previousSecond());
        System.out.println(time.previousMinute());
        System.out.println(time.previousHour());
        System.out.println(time.nextSecond());
        System.out.println(time.nextMinute());
        System.out.println(time.nextHour());
        System.out.println("----------------------");
        System.out.println(time.getSecond());
        System.out.println(time.getMinute());
        System.out.println(time.getHour());
        time.setSecond(5);
        System.out.println(time);
        time.setMinute(5);
        System.out.println(time);
        time.setHour(5);
        System.out.println(time);
    }
}
