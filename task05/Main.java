package task05;

public class Main {
    public static void main(String[] args){
        int a=2020;//
        method(a);
    }

    public static void method(int a){
        System.out.println((a%400==0) || (a%4==0 && a%100!=0)?"високосный":"не високосный");
    }
}
