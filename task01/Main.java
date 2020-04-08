package task01;

public class Main {
    public static void main(String[] args){
//
        int a=10;
        int b=2;
        int c=7;
        int d=9;
        float f = method(a,b,c,d);
        System.out.println(f);
    }

    public static float method(int a, int b, int c, int d){
        return  a * (b + (c / (float) d));
    }
}
