import java.util.Scanner;

// import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

class week2a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number-");
        int n = sc.nextInt();
         
            int num = 1;
            for (int i = 0; i < n; i++){
                for (int j = 0; j <= i; j++){
                    System.out.print(num + " ");
                    ++num;
                }
                System.out.println();

            }
        
    }
}