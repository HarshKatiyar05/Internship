public class Immutable_class {
  public static void main(String args[])
{
  College c = new College("vit","jaipur") ;
    Student s = new Student(21,"harsh",c) ;
   System.out.println(s.getCollege().name);
    s.getCollege().name = "IIT B" ;
    System.out.println(s.getCollege().name);
}  
}

final class Student{
   private final int age ;
   private final String name ;
   private final College college ;
     
   Student(int age , String name,College college){
    this .age = age ;
    this.name = name ;
    this.college = new College(college.name,college.address);
   }

    public int getAge(){
    return this.age ;
   }
   public String getName(){
    return this.name ;
   }
   public College getCollege(){
    return new College(this.college.name,this.college.address) ;
   }

}

class College{
  String name ;
  String address;

  College(String name , String address){
    this.name = name ;
    this.address= address;
  }
}

