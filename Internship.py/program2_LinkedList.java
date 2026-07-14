import java.util.LinkedList;
public class program2_LinkedList {
  public static void main(String args[]){
     LinkedList<Integer> link1= new LinkedList<>() ;

     link1.add(10) ;
     link1.add(20) ;
     link1.add(30) ;
     link1.add(10) ;
     link1.add(40) ;
     // this method is use for find last indexOf of any element  

     System.out.println(link1.lastIndexOf(10)) ;
     // peek() retrun first element of a linkedList
       System.out.println(    link1.peek()) ;

       // poll return and remove the first element form the linkedList
       System.out.println(link1.poll()) ;
       System.out.println(link1) ;

       //offer() adds the specified element at the end of the linked listf
       System.out.println(link1.offer(4)) ;
       System.out.println(link1) ;

  //    // addFirst and addLast
  //    link1.addFirst(1) ;
  //    System.out.println(link1) ;
  //    //addLast
  //    link1.addLast(5) ;
  //    //removeFirst
  //    link1.removeFirst() ;
  //    //removeLast
  //    link1.removeLast() ;

  //    // peek() retrun first element of a linkedList
  //    link1.peek() ;

  //    System.out.println(link1) ;
  }
}
