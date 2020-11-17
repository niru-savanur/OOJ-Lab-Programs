import CIE.*;
import SEE.*;
import java.util.Scanner;

class finalmarks {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF STUDENTS");
        int n = s.nextInt();
        SEE.Externals ob1[] = new SEE.Externals[n];
        CIE.Internals ob[] = new CIE.Internals[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nENTER THE USN,NAME AND SEMESTER OF STUDENT" + (i + 1));
            String u = s.next();
            String nm = s.next();
            int se = s.nextInt();
            ob1[i] = new SEE.Externals(u, nm, se);
            
            ob[i] = new CIE.Internals();
            ob[i].get();
            ob1[i].get();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("\nSTUDENT_" + (i + 1));
            System.out.println("name = " + ob1[i].name +"\tusn = " + ob1[i].usn + "\tsem = " + ob1[i].sem);
            for (int j = 0; j < 5; j++) {
                System.out.println("SUBJECT_" + (j + 1) + "_MARKS = " + (ob[i].cie[j] + (ob1[i].see[j])/2));
            }
        }
    }
}
