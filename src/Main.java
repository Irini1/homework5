public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr;
        arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(arr[0]);
        double[] arr2 = {1.1, 1.2,1.3};
        System.out.println(arr2[1]);
        String[] arr3 = {" Иван", "Yurii", "Max", "John"};
        System.out.println(arr3[3]);
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.println(arr[i] + ",");
            }else {
                System.out.println(arr[i]);
            }

        }
        for (int i = 0; i < arr2.length; i++) {
            if (i < arr2.length - 1) {
                System.out.println(arr2[i] + ",");

            }else {
                System.out.println(arr2[i]);
            }

        }
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr3.length - 1) {
                System.out.println(arr3[i] + ",");
            }else{
                System.out.println(arr3[i]);
            }
        }
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if (i > 0)
                System.out.print(arr[i] + ",");

            else if (i == 0)
                System.out.print(arr[i]);
            
        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0 ; i--) {
            if (i > 0)
                System.out.print(arr2[i] + ",");
            else if (i == 0)
                System.out.print(arr2[i]);

        }
        System.out.println();
        for (int i = arr3.length - 1; i >= 0 ; i--){
            if (i > 0)
                System.out.print(arr3[i] + ",");
            else if (i == 0)
                System.out.print(arr3[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                arr[i] ++;

            }
            System.out.print(arr[i] + " " );
        }
    }
}