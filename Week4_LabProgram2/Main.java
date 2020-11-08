import java.util.Scanner;
class Student{
    private String usn;
    private String name;
    private int[] credits = new int[20];
    private int[] marks = new int[20];
    private int n;

    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of subjects:");
        n = sc.nextInt();
        System.out.println("Enter Student usn");
        usn = sc.next();
        System.out.println("Enter Student name");
        name = sc.next();
        
        for(int i = 0; i < n; i++){
            System.out.println("Enter credits followed by marks for subject " + (i+1) + ":" );
            credits[i] = sc.nextInt();
            marks[i] = sc.nextInt();
        }
    }


    void printDetails(){
        System.out.println("Student details are as follows:");
        System.out.println("Name: " + name + "\tusn: " + usn);
         for(int i = 0; i < n; i++){
             System.out.println("Sub" + (i+1) + " Marks is: " + marks[i] + "\tCredit is: " + credits[i]);
         }
    }


    void sgpaClac(){
        double sgpa;
        int[] gpcr = new int[n];
        int credSum = 0, gp, sgpcr = 0;
        for(int i = 0; i < n; i++){
            credSum += credits[i];
            if (marks[i] >= 90){
                gp = 10;
            }
            else if(marks[i] >= 80){
                gp = 9;
            }
            else if(marks[i] >= 70){
                gp = 8;
            }
            else if(marks[i] >= 60){
                gp = 7;
            }
            else if(marks[i] >= 50){
                gp = 5;
            }
            else if(marks[i] >= 40){
                gp = 4;
            }
            else{
                gp = 0;
            }
            gpcr[i] = gp * credits[i];
            sgpcr += gpcr[i];
        }
        sgpa = sgpcr / (credSum + 0.0);
        System.out.println("Student's sgpa is: " + sgpa);
    }
}


public class Main {
    public static void main(String[] args){
        Student s1 = new Student();
      
        
        s1.getDetails();
        s1.printDetails();
        s1.sgpaClac();
    }
}
