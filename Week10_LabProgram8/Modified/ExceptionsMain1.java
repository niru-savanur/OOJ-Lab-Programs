import java.util.Scanner;
class WrongAge extends Exception {
int age;
WrongAge(int x) {
age = x;
}
public String toString() {
return "AGE OF FATHER=" + age + " IS ENTERED INCORRECTLY";
}
}
class WrongAgeSon extends Exception {
int age;
WrongAgeSon(int x) {
age = x;
}
public String toString() {
return "AGE OF SON=" + age + " IS ENTERED INCORRECTLY";
}
}

class Father {
int a;
Father(int x) {
a = x;
}
void check() throws WrongAge {
if (a<0) {
throw new WrongAge(a);
}
}
}

class Son extends Father {
int age;
Son(int fage,int sage) {
	super(fage);
age = sage;
}
void compute() throws WrongAgeSon {
if (age >= a) {
throw new WrongAgeSon(age);
} else {
System.out.println("THE AGES ARE ENTERED CORECTLY");
System.out.println("FATHER'S AGE=" + a + "\t" + "SON'S AGE=" + age);
}
}
}
class ExceptionsMain1 {
public static void main(String args[]) {
Scanner s = new Scanner(System.in);
System.out.println("ENTER FATHER'S AGE:");
int f = s.nextInt();
System.out.println("ENTER SON'S AGE:");
int so = s.nextInt();
Son ss = new Son(f,so);
try {
ss.check();
try {
ss.compute();
} catch (WrongAgeSon e) {
System.out.println(e);
}
} catch (WrongAge e) {
System.out.println(e);
}

}
}