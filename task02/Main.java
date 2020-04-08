package task02;

public class Main {
    public static void main(String[] args){
        int a=5;//
        int b=7;
        boolean c = method(a,b);
    }

    public static boolean method(int a, int b){
        return a+b>=10 && a+b<=20;
    }
}
