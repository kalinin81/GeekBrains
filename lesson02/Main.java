package lesson02;


public class Main {
    public static void main(String[] args){

        int[] arr = {1,0,1,0,0,1,0,1,1};
        task01(arr);

        int[] arr02 = new int[8];
        task02(arr02);

        int[] arr03 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task03(arr03);

        int[] arr04 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task04_min(arr04);
        task04_max(arr04);

        int[][] arr05 = new int[5][5];
        task05(arr05);

        int[] arr06 = {2, 1, 1, 2, 1};
        boolean res = task06(arr06);

        //task07()
        // Иван, в этой задаче нужно вернуть новый массив,
        // который будет использоваться как вспомогательный?

        int[] arr07 = {1, 2, 3, 4, 5, 6};
        int n = 5;
        task08(arr07,n);
    }

    private static void task08(int[] arr, int n) {

        int nn=Math.abs(n)<arr.length?n:n%arr.length;
        nn=nn<0?arr.length+nn:nn;
        int last;
        for (int i=0;i<nn;i++){
            last = arr[0];
            for (int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=last;
        }
    }

    private static boolean task06(int[] arr) {
        int sum_left=0, sum_right=0;
        for (int i=0;i<arr.length;i++){
            sum_left+=arr[i];
            sum_right=0;
            for (int j=i+1;j<arr.length;j++){
                sum_right+=arr[j];
                if (sum_left<sum_right)
                    break;
            }
            if (sum_left==sum_right)
                break;
        }
        return sum_left==sum_right;

    }

    private static void task05(int[][] arr) {
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[i].length;j++){
                if (i==j)
                    arr[i][j] = 1;
            }
        }


    }

    private static void task04_min(int[] arr) {
        int res;
        if (arr.length!=0) {
            res = arr[0];
            for (int i=1;i<arr.length;i++)
                res = Math.min(arr[i], res);
        }
    }
    private static void task04_max(int[] arr) {
        int res;
        if (arr.length!=0) {
            res = arr[0];
            for (int i=1;i<arr.length;i++)
                res = Math.max(arr[i], res);
        }
    }

    private static void task03(int[] arr) {
        for (int i=0;i<arr.length;i++)
            arr[i] *= arr[i]<6?2:1;
    }

    private static void task02(int[] arr) {
        for (int i=0;i<arr.length;i++)
            arr[i]=i*3+1;

    }

    private static void task01(int[] arr) {
        for (int i=0;i<=arr.length-1;i++)
            arr[i]=arr[i]==0?1:0;
    }
}
