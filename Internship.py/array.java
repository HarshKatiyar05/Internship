public class array {
   public static void main(String args[]) {
    // int[][] arr = new int[3][3];
    // arr[0][0] = 23;
    // arr[0][1] = 34;
    // arr[0][2] = 41;

    // arr[1][0] = 20;
    // arr[1][1] = 11;
    // arr[1][2] = 56;

    // arr[2][0] = 13;
    // arr[2][1] = 74;
    // arr[2][2] = 48;
      

    // for(int i=0;i<arr.length;i++){
    //   for(int j=0;j<arr[i].length;j++){
    //        System.out.print(arr[i][j]+" ") ;
    //   }
    //   System.out.println() ;
    // }

      //MULTIDIMENTIONAL ARRAY --> WITH DIFFERENT LENGTH

       int [][] arr = new int [3][] ;
       arr[0]= new int[1] ;
       arr[1]=new int[2] ;
       arr[2]= new int[3] ;

       arr[0][0]=12;

       arr[1][0]=13;
       arr[1][1]=15;

       arr[2][0]= 17 ;
       arr[2][1]= 19 ;
       arr[2][2] = 20 ;

       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
          System.out.print(arr[i][j]+" ") ;
        }
        System.out.println() ;
       }
  }
}
