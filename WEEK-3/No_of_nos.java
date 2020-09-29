import java.util.Scanner;

public class No_of_nos {
    public static void main(String args[]) {
        
        int n, positive = 0, negative = 0, zero = 0, i;
        int arr[] = new int[50];
        Scanner scan = new Scanner(System.in);

        
        System.out.println("How many Number you want to Enter : ");
        n = scan.nextInt();

        
        System.out.println("Enter " + n + " Numbers : ");

        
        for (i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (arr[i] < 0) {
                negative++;
            } else if (arr[i] == 0) {
                zero++;
            } else {
                positive++;
            }
        }
        
        System.out.println("Positive Numbers are: " + positive);
        System.out.println("\nNegative Numbers are: " + negative);
        System.out.println("\nZeros are: " + zero);
    }
}