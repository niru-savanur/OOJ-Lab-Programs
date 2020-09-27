import java.util.Scanner;
import java.lang.Math;
public class week2d {
    public static void main(String args[]){
        final double pi = 3.14;
        double r, h;
        int choice;
    double area, volume;
    System.out.println("Enter shape you want\n");
    Scanner sc = new Scanner(System.in);
    do
    {
        System.out.println("menu 1:Cylider 2:Cone 3:Sphere 4:Exit\n");
        choice = sc.nextInt();
        switch (choice)
        {
        case 1:
            System.out.println("Enter radius:\n");
            r = sc.nextDouble();
            System.out.println("Enter height:\n");
            h = sc.nextDouble();
            area = (2 * pi * r * h) + (2 * pi * (Math.pow(r, 2)));
            volume = pi * (Math.pow(r, 2)) * h;
            System.out.println("Area:"+ area +" Volume:"+ volume+"\n");
            break;
        case 2:
            System.out.println("Enter radius:\n");
            r = sc.nextDouble();
            System.out.println("Enter height:\n");
            h = sc.nextDouble();
            area = pi * r * (r + Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2)));
            volume = pi * Math.pow(r, 2) * h / 3.0;
            System.out.println("Area:"+area+" Volume:"+ volume+"\n");
            break;
        case 3:
            System.out.println("Enter radius:\n");
            r = sc.nextDouble();
            area = 4 * pi * Math.pow(r, 2);
            volume = (4 / 3.0) * (pi * (Math.pow(r, 3)));
            System.out.println("Area:"+area+" Volume:"+ volume+"\n");
            break;
        case 4:
            System.out.println("Exit\n");
            sc.close();
            break;
        default:
            System.out.println("Enter a no. ranging from 1 to 4\n");
        }
        
    } while (choice != 4);
    }
}
