import java.util.Scanner;

class Age{
    private int years;
    private int months;
    private double age;

    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many years are you old?");
        years = sc.nextInt();
        System.out.println("How many months are you old?");
        months = sc.nextInt();
    }

    String older(Age a){
        this.age = this.years + (this.months / 12.0);
        a.age = a.years + (a.months / 12.0);
        if(this.age > a.age){
            return "Person1";
        }
        else if(a.age > this.age){
            return "Person2";
        }
        return "0";
    }
}

public class AgeMain {
    public static void main(String[] args) {
        Age a1 = new Age();
        Age a2 = new Age();
        System.out.println("Enter 1st person's age");
        a1.getDetails();
        System.out.println("Enter 2nd person's age");
        a2.getDetails();
        String eq = a1.older(a2);
        if(eq == "0"){
            System.out.println("They're both of same age");
        }
        else{
            System.out.println(eq + " is oldest among two.");
        }
        
    }
}
