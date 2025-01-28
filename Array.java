import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements to be entered into array:");
        for(int i=0; i<size; i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Elements of array:");
        for(int i=0; i<size; i++){
            System.out.println(array[i]+ " ");
        }
        sc.close();
    }
}
