/* =========================================================
1. Store City Names & STD Codes (Add, Remove, Search)
========================================================= */

import java.util.*;

class Test1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Add
        map.put("Pune", 020);
        map.put("Mumbai", 022);
        map.put("Delhi", 011);

        // Display
        System.out.println("Map: " + map);

        // Remove
        map.remove("Delhi");

        // Search
        if(map.containsKey("Pune"))
            System.out.println("Pune exists with code: " + map.get("Pune"));
    }
}


/* =========================================================
2. HashMap Sorted According to Keys
========================================================= */

import java.util.*;

class Test2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        // Convert to TreeMap for sorting
        TreeMap<Integer, String> sorted = new TreeMap<>(map);

        System.out.println("Sorted Map: " + sorted);
    }
}


/* =========================================================
3. Load Names & Phone Numbers from File (Hashtable)
========================================================= */

import java.util.*;
import java.io.*;

class Test3 {
    public static void main(String[] args) throws Exception {
        Hashtable<String, String> ht = new Hashtable<>();

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;

        while((line = br.readLine()) != null) {
            String[] parts = line.split(" ");
            ht.put(parts[0], parts[1]);
        }

        br.close();
        System.out.println(ht);
    }
}


/* =========================================================
4. Load RollNo & Name from File (Hashtable)
========================================================= */

import java.util.*;
import java.io.*;

class Test4 {
    public static void main(String[] args) throws Exception {
        Hashtable<Integer, String> ht = new Hashtable<>();

        BufferedReader br = new BufferedReader(new FileReader("students.txt"));
        String line;

        while((line = br.readLine()) != null) {
            String[] parts = line.split(" ");
            ht.put(Integer.parseInt(parts[0]), parts[1]);
        }

        br.close();
        System.out.println(ht);
    }
}


/* =========================================================
5. ListIterator Traversal (Forward & Backward)
========================================================= */

import java.util.*;

class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> it = list.listIterator();

        System.out.println("Forward:");
        while(it.hasNext())
            System.out.println(it.next());

        System.out.println("Backward:");
        while(it.hasPrevious())
            System.out.println(it.previous());
    }
}


/* =========================================================
6. TreeMap(BookID, BookName) Operations
========================================================= */

import java.util.*;

class Test6 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");

        System.out.println("Books: " + map);

        // Remove
        map.remove(102);

        // Search
        if(map.containsKey(101))
            System.out.println("Book Found: " + map.get(101));
    }
}


/* =========================================================
7. LinkedList Operations
========================================================= */

import java.util.*;

class Test7 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);

        list.addFirst(5);      // add first
        list.removeLast();     // remove last

        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
    }
}


/* =========================================================
8. Word Frequency using HashMap
========================================================= */

import java.util.*;

class Test8 {
    public static void main(String[] args) {
        String str = "java is easy java is powerful";

        HashMap<String, Integer> map = new HashMap<>();

        String[] words = str.split(" ");

        for(String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        System.out.println("Word Frequency: " + map);
    }
}
