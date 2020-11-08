import java.util.Scanner;
public class week2c {
    public static void main(String args[]){
        int a, b, num1, num2, i, j;
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter two nos:");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    if(num1>num2){
        a = num2;
        b = num1;
    }
    else{
        a = num1;
        b = num2;
    }
    if(b < 2){
        System.out.println("there are no prime nos in this range.");
        System.exit(0);
    }
    System.out.println("prime nos in the range are:");
    for (i = a; i <= b; i++){
        int flag = 0;
        for(j = 2; j <= i/2; j++){
            if (i % j == 0){
                flag = 1;
                break;
            }
        }
        if (flag == 0 && i != 1 && i != 0){
        System.out.print(i);
        System.out.println();
        }
        }
    }
}
