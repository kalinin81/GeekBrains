package task05;

public class Main {
    public static void main(String[] args){
        int a=2020;//
        String res = method(a);
        System.out.println(res);
    }

    public static String method(int a){
        return (a%400==0) || (a%4==0 && a%100!=0)?"високосный":"не високосный";
    }
}
