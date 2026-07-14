import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_byHashset {
  public static void main(String args[]) {
    // Set<Integer> s1 = new HashSet<>();
    // Set<Integer> s2 = new HashSet<>();

    // s1.add(1);
    // s1.add(2);
    // s1.add(3);
    // s1.add(4);

    // s2.add(3);
    // s2.add(4);
    // s2.add(5);
    // s2.add(6);

    // s1.retainAll(s2);// retainAll only print the value which was common on both
    // sets
    // System.out.println(s1);
    // System.out.println(s1.containsAll(s2));// this method check that s1 contains
    // all the element of s2 if yes return
    // ture or false ;

    // Set<Integer> st = new HashSet<>();

    // st.add(1);
    // st.add(1);
    // st.add(1);
    // st.add(2);
    // st.add(2);
    // st.add(2);
    // st.add(3);

    // System.out.println(st) ;

    // THEN WE ARE USING LINKEDHASHSET ;
    // Set<Integer> s1 = new LinkedHashSet<>() ;
    // s1.add(10) ;
    // s1.add(10) ;
    // s1.add(10) ;
    // s1.add(20) ;
    // s1.add(20) ;
    // s1.add(30) ;
    // s1.add(30) ;

    // System.out.println(s1) ;

    // THEN WE ARE USING LINKEDHASHSET ;
    Set<Integer> s1 = new TreeSet<>();
    s1.add(40);
    s1.add(10);
    s1.add(10);
    s1.add(20);
    s1.add(20);
    s1.add(30);
    s1.add(30);

    System.out.println(s1);

  }

}
