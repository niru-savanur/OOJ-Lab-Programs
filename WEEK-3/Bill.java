import java.util.Scanner;
public class Bill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter the number of items:");
        int n = sc.nextInt();
        double indTot, tot = 0;
        double[] rpi = new double[n];
        int[] quant = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("enter quantity of purchase and rate per item for item"+(i+1));
            int q = sc.nextInt();
            double r = sc.nextDouble();
            quant[i] = q;
            rpi[i] = r;
        }
        for(int i = 0; i<n; i++){
            indTot = quant[i] * rpi[i] ; 
            tot += indTot;
        }
        if (tot >= 10000) {
            System.out.println("Discount = 5%. Total bill = " + tot + ", Discounted bill = " + (tot - tot * 0.05));
        }
        
        else if (tot >= 7500) {
            System.out.println("Discount = 3%. Total bill = " + tot + ", Discounted bill = " + (tot - tot * 0.03));
        }
         else if (tot >= 5000) {
            System.out.println("Discount = 2%. Total bill = " + tot + ", Discounted bill = " + (tot - tot * 0.02));
        }
        else{
            System.out.println(" No discount. Total bill = " + tot );
        }
        
    }
}
