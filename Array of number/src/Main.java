import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input Nunber of Integer: ");
        n= scanner.nextInt();
        int[] arr= new int[n];
        System.out.println("Input all number below:");
        for(int i=0;i<n;i++){

            arr[i]=scanner.nextInt();

        }
        System.out.println("All number below:");
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+"\t");

        }





    }
}