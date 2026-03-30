/* =========================================================
1. Read N Names using HashSet and Display in Ascending Order
========================================================= */

import java.util.*;

class Test1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Rahul");
        set.add("Amit");
        set.add("Sneha");
        set.add("Pooja");

        // Convert to TreeSet for sorting
        TreeSet<String> sorted = new TreeSet<>(set);

        System.out.println("Ascending Order: " + sorted);
    }
}


/* =========================================================
2. Hashtable for Mobile Number and Student Name using Enumeration
========================================================= */

import java.util.*;

class Test2 {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();

        ht.put("9876543210", "Amit");
        ht.put("9123456780", "Rahul");

        Enumeration<String> keys = ht.keys();

        while(keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Mobile: " + key + " Name: " + ht.get(key));
        }
    }
}


/* =========================================================
3. TreeSet of Colors (Ascending Order)
========================================================= */

import java.util.*;

class Test3 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println("Ascending Colors: " + colors);
    }
}


/* =========================================================
4. Store N Integers in LinkedList and Display Negative Integers
========================================================= */

import java.util.*;

class Test4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(-5);
        list.add(20);
        list.add(-15);

        System.out.println("Negative Numbers:");
        for(int n : list) {
            if(n < 0)
                System.out.println(n);
        }
    }
}


/* =========================================================
5. Store N Integers without Duplicates and Display Sorted Order
========================================================= */

import java.util.*;

class Test5 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(5);
        set.add(2);
        set.add(8);
        set.add(2); // duplicate

        TreeSet<Integer> sorted = new TreeSet<>(set);

        System.out.println("Sorted Unique Values: " + sorted);
    }
}


/* =========================================================
6. Hashtable for Mobile Number and Student Contact List
========================================================= */

import java.util.*;

class Test6 {
    public static void main(String[] args) {
        Hashtable<String, String> contacts = new Hashtable<>();

        contacts.put("9876543210", "Amit");
        contacts.put("9123456780", "Rahul");
        contacts.put("9988776655", "Sneha");

        System.out.println("Contact List:");
        for(String key : contacts.keySet()) {
            System.out.println("Mobile: " + key + " Name: " + contacts.get(key));
        }
    }
}
