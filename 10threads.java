/* =========================================================
1. Generate 10 Random Numbers using Thread
========================================================= */

class RandomNumbers extends Thread {
    public void run() {
        for(int i=0; i<10; i++) {
            int num = (int)(Math.random() * 100);
            System.out.println(num);
        }
    }
}

class Test1 {
    public static void main(String[] args) {
        new RandomNumbers().start();
    }
}


/* =========================================================
2. Display Thread Name and Priority
========================================================= */

class ThreadInfo extends Thread {
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Priority: " + Thread.currentThread().getPriority());
    }
}

class Test2 {
    public static void main(String[] args) {
        ThreadInfo t = new ThreadInfo();
        t.setName("MyThread");
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
    }
}


/* =========================================================
3. Display Vowels from String every 3 seconds
========================================================= */

class VowelThread extends Thread {
    String str;

    VowelThread(String s) {
        str = s;
    }

    public void run() {
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if("AEIOUaeiou".indexOf(ch) != -1) {
                System.out.println("Vowel: " + ch);
                try { Thread.sleep(3000); } catch(Exception e) {}
            }
        }
    }
}

class Test3 {
    public static void main(String[] args) {
        new VowelThread("Hello World").start();
    }
}


/* =========================================================
4. Count Even and Odd Numbers (1–100) using Two Threads
========================================================= */

class EvenThread extends Thread {
    public void run() {
        for(int i=1; i<=100; i++)
            if(i % 2 == 0)
                System.out.println("Even: " + i);
    }
}

class OddThread extends Thread {
    public void run() {
        for(int i=1; i<=100; i++)
            if(i % 2 != 0)
                System.out.println("Odd: " + i);
    }
}

class Test4 {
    public static void main(String[] args) {
        new EvenThread().start();
        new OddThread().start();
    }
}


/* =========================================================
5. Display A–Z Alphabets every 2 seconds
========================================================= */

class AlphabetThread extends Thread {
    public void run() {
        for(char ch='A'; ch<='Z'; ch++) {
            System.out.println(ch);
            try { Thread.sleep(2000); } catch(Exception e) {}
        }
    }
}

class Test5 {
    public static void main(String[] args) {
        new AlphabetThread().start();
    }
}
