import java.util.Scanner;

class generic1<DT1, DT2> {
    DT1 obj;
    DT2 obj1;

    generic1(DT1 a, DT2 b) {
        obj = a;
        obj1 = b;
    }

    DT1 get1() {
        return obj;
    }

    DT2 get2() {
        return obj1;
    }
}

class GreaterGen {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE THREE INTEGER VALUES");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println("ENTER THE THREE DOUBLE VALUES");
        double x1 = s.nextDouble();
        double x2 = s.nextDouble();
        double x3 = s.nextDouble();
        generic1<Integer, Double> g = new generic1<Integer, Double>(a, x1);
        generic1<Integer, Double> g1 = new generic1<Integer, Double>(b, x2);
        generic1<Integer, Double> g2 = new generic1<Integer, Double>(c, x3);
        int sum = g.get1() + g1.get1() + g2.get1();
        double sum1 = g.get2() + g1.get2() + g2.get2();
        if (g.get1() >= g1.get1() && g.get1() >= g2.get1())
            System.out.println("THE GREATEST INTEGER IS=" + g.get1());
        if (g1.get1() >= g.get1() && g1.get1() >= g2.get1())
            System.out.println("THE GREATEST INTEGER IS=" + g1.get1());
        else
            System.out.println("THE GREATEST INTEGER IS=" + g2.get1());
        if (g.get2() >= g1.get2() && g.get2() >= g2.get2())
            System.out.println("THE GREATEST DOUBLE VALUE IS=" + g.get2());
        if (g1.get2() >= g.get2() && g1.get2() >= g2.get2())
            System.out.println("THE GREATEST DOUBLE VALUE IS=" + g1.get2());
        else
            System.out.println("THE GREATEST DOUBLE VALUE IS=" + g2.get2());
        System.out.println("THE SUM OF ALL THE INTEGERS IS=" + sum);
        System.out.println("THE SUM OF ALL THE DOUBLE VALUES IS=" + sum1);
    }
}
