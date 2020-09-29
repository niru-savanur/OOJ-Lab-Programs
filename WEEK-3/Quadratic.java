
import java.lang.Math;
import java.util.Scanner;


public class Quadratic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Finding roots of a quadratic equation-----");
        System.out.println("Enter coefficients a, b, c of a QE in order w.r.t equation ax^2+bx+c=0");
        double r, sqrt;
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double disc = (Math.pow(b, 2)) - 4 * a * c;
        if(disc < 0){
            sqrt = (Math.sqrt(-disc))/ (2 * a);
            r = -b /(2*a);
            

            System.out.println("Discriminant is negative. So no real roots are possible");
            System.out.println("Imaginary roots are: " + r + " +i " + sqrt + " and " + r + " -i " + sqrt );
            System.out.printf("or\n Imaginary roots are: %.2f +i %.4f and %.2f -i %.4f", r, sqrt,r,sqrt);
        }
        else if(disc > 0){
            sqrt = (Math.sqrt(disc)) / (2 * a);
            r = -b / (2 * a);
            System.out.println("Real roots are: "+ (r+sqrt) + " and " + (r-sqrt));
            System.out.printf("or\n Real roots are: %.4f and %.4f ", (r + sqrt), (r - sqrt));
        }
        else if(disc == 0){
            r = -b / (2 * a);
            System.out.println("Roots are equal to: "+ r);
        }
        

    }
}