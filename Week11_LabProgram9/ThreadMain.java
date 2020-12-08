class thread1 implements Runnable {
    String branch;
    int sid, sem;
    Thread t;

    thread1(String dept) {
        branch = dept;
        t = new Thread(this, "THREAD_1");
        t.start();
    }

    public void run() {
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("---------------------------------------");
                System.out.println("BRANCH  : " + branch);

                Thread.sleep(2000);
            }
        } catch (InterruptedException ie) {
            System.out.println("THREAD 1 WAS INTERRUPTED WHILE SLEEPING");
        }
        System.out.println("THREAD 1 EXITED (BRANCH NAME)");
    }
}

class thread2 implements Runnable {
    String name;
    Thread t2;

    thread2(String collegename) {
        name = collegename;
        t2 = new Thread(this, "THREAD_2");
        t2.start();
    }

    public void run() {
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("---------------------------------------");
                System.out.println("COLLEGE : " + name);
                Thread.sleep(10000);
            }
        } catch (InterruptedException y) {
            System.out.println("THREAD 2 WAS INTERRUPTED WHILE SLEEPING");
        }
        System.out.println("THREAD 2 EXITED (COLLEGE NAME)");
    }
}

class ThreadMain {
    public static void main(String ss[]) {
        System.out.println("DISPLAYING INFORMATION");
        thread1 n1 = new thread1("CSE");
        thread2 n2 = new thread2("B.M.S COLLEGE OF ENGINEERING");
    }
}