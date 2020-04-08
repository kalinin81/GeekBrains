package task03;

public class Main {
    public static void main(String[] args){
        int a=10;//
        String res = method(a);
        System.out.println(res);
    }

    public static String method(int a){

        return  a>=0?"положителное":"отрицательное";
    }
}
