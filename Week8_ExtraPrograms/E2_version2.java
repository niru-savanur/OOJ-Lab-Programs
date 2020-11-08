import java.util.Scanner;
class person{
    Scanner s=new Scanner(System.in);
    String name;
    void get()
    {
System.out.println("ENTER THE NAME OF THE PERSON");
name=s.next();
    }
}
class employee extends person{
    Scanner s=new Scanner(System.in);
    int empid;
    void get(){
        super.get();
        System.out.println("ENTER THE EMPID");
        empid=s.nextInt();
    }
}
class student extends person{
    Scanner s=new Scanner(System.in);
    int sid;
    void get(){
        super.get();
        System.out.println("ENTER THE STUDENT ID");
        sid=s.nextInt();
    }
}
class teaching extends employee{
    Scanner s=new Scanner(System.in);
    int exp;
    void get(){
        super.get();
        System.out.println("ENTER THE NUMBER OF YEARS OF EXPERIENCE TEACHING STAFF");
        exp=s.nextInt();
    }
}
class nonteaching extends employee{
    Scanner s=new Scanner(System.in);
    double sal;
    void get(){
        super.get();
        System.out.println("ENTER THE SALARY OF NON TEACHING STAFF");
        sal=s.nextDouble();
    }
}
class ug extends student{
    Scanner s=new Scanner(System.in);
    String ugcourse;
    void get(){
        super.get();
        System.out.println("ENTER THE TYPE OF UG COURSE ");
        ugcourse=s.next();
    }
}
class pg extends student{
    Scanner s=new Scanner(System.in);
    String pgcourse;
    void get(){
        super.get();
        System.out.println("ENTER THE TYPE OF PG COURSE ");
        pgcourse=s.next();
    }
}

class personmain
{
    public static void main(String args[])
    {  
        teaching t=new teaching();
        nonteaching n=new nonteaching();
        ug u=new ug();
        pg p=new pg();
        System.out.println("ENTER THE DETAILS OF TEACHING STAFF");
        t.get();
        System.out.println("ENTER THE DETAILS OF NON TEACHING STAFF");
        n.get();
        System.out.println("ENTER THE DETAILS OF UG STUDENT");
        u.get();
        System.out.println("ENTER THE DETAILS OF PG STUDENT");
        p.get();
    }
}