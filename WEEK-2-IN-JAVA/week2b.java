import java.util.Scanner;
import java.lang.Math;
class week2b {
    public static void main(String args[]){
        final int SUB = 6;
        float[] cieMark = new float[SUB];
        float[] seeMark = new float[SUB];
        float[] totMark = new float[SUB];
        float cie, see;
        int i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cie marks out of 50-\n");
         for ( i = 0; i<SUB; i++){
            System.out.print("sub"+(i+1)+"\n");
            
            cie = sc.nextFloat();
            if (cie > 50) {
                System.out.println("enter marks for 50-\n");
                i -= 1;
            }
            cieMark[i] = Math.round(cie);
        }
        System.out.println("Enter see marks out of 100-\n");
        for( j = 0; j< SUB; j++){
            System.out.print("sub"+(j+1)+"\n");
            
            see = sc.nextFloat();
            if (see > 100){
                System.out.println("enter marks for 100-\n");
                i -= 1;
            }
            else {
                seeMark[j] = Math.round(see/2);
            }
        }
        for (k = 0; k < SUB; k++) {
            totMark[k] = cieMark[k] + seeMark[k];
            System.out.println("for subject " + (k+1) + " grade is:\n");
            if (totMark[k] >= 90) {
                System.out.println("S\n");
            } else if (totMark[k] >= 80) {
                System.out.println("A\n");
            } else if (totMark[k] >= 70) {
                System.out.println("B\n");
            } else if (totMark[k] >= 60) {
                System.out.println("C\n");
            } else if (totMark[k] >= 50) {
                System.out.println("D\n");
            } else if (totMark[k] >= 40) {
                System.out.println("E\n");
            } else {
                System.out.println("F\n");
            }

        }

        
        
    }
}