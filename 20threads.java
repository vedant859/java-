/* =========================================================
1. Three Threads:
   - Thread1: Generate random number
   - Thread2: Print square if even
   - Thread3: Print cube if odd
========================================================= */

class RandomThread extends Thread {
    public void run() {
        try {
            int num = (int)(Math.random() * 100);
            System.out.println("Generated: " + num);

            if(num % 2 == 0)
                new SquareThread(num).start();
            else
                new CubeThread(num).start();

        } catch(Exception e) {}
    }
}

class SquareThread extends Thread {
    int n;
    SquareThread(int n) { this.n = n; }

    public void run() {
        System.out.println("Square: " + (n * n));
    }
}

class CubeThread extends Thread {
    int n;
    CubeThread(int n) { this.n = n; }

    public void run() {
        System.out.println("Cube: " + (n * n * n));
    }
}

class Test1 {
    public static void main(String[] args) {
        new RandomThread().start();
    }
}


/* =========================================================
2. Thread printing text n times
========================================================= */

class TextThread extends Thread {
    String msg;
    int n;

    TextThread(String m, int n) {
        msg = m;
        this.n = n;
    }

    public void run() {
        for(int i=0; i<n; i++)
            System.out.println(msg);
    }
}

class Test2 {
    public static void main(String[] args) {
        new TextThread("COVID19", 5).start();
        new TextThread("LOCKDOWN2020", 5).start();
    }
}


/* =========================================================
3. Three Threads printing different messages
========================================================= */

class MsgThread extends Thread {
    String msg;
    int count;

    MsgThread(String m, int c) {
        msg = m;
        count = c;
    }

    public void run() {
        for(int i=0; i<count; i++)
            System.out.println(msg);
    }
}

class Test3 {
    public static void main(String[] args) {
        new MsgThread("Hello", 10).start();
        new MsgThread("GoodMorning", 20).start();
        new MsgThread("HaveANiceDay", 30).start();
    }
}


/* =========================================================
4. Producer Consumer (Thread Synchronization)
========================================================= */

class Shared {
    int data;
    boolean flag = false;

    synchronized void produce(int value) {
        while(flag)
            try { wait(); } catch(Exception e) {}

        data = value;
        System.out.println("Produced: " + data);
        flag = true;
        notify();
    }

    synchronized void consume() {
        while(!flag)
            try { wait(); } catch(Exception e) {}

        System.out.println("Consumed: " + data);
        flag = false;
        notify();
    }
}

class Producer extends Thread {
    Shared s;
    Producer(Shared s) { this.s = s; }

    public void run() {
        for(int i=1; i<=5; i++)
            s.produce(i);
    }
}

class Consumer extends Thread {
    Shared s;
    Consumer(Shared s) { this.s = s; }

    public void run() {
        for(int i=1; i<=5; i++)
            s.consume();
    }
}

class Test4 {
    public static void main(String[] args) {
        Shared s = new Shared();
        new Producer(s).start();
        new Consumer(s).start();
    }
}


/* =========================================================
5. Three Threads:
   - Generate numbers 1–20
   - Print divisible by 3
   - Print divisible by 5
========================================================= */

class NumberThread extends Thread {
    public void run() {
        for(int i=1; i<=20; i++) {
            System.out.println("Generated: " + i);
            try { Thread.sleep(500); } catch(Exception e) {}
        }
    }
}

class Div3Thread extends Thread {
    public void run() {
        for(int i=1; i<=20; i++)
            if(i % 3 == 0)
                System.out.println("Divisible by 3: " + i);
    }
}

class Div5Thread extends Thread {
    public void run() {
        for(int i=1; i<=20; i++)
            if(i % 5 == 0)
                System.out.println("Divisible by 5: " + i);
    }
}

class Test5 {
    public static void main(String[] args) {
        new NumberThread().start();
        new Div3Thread().start();
        new Div5Thread().start();
    }
}
