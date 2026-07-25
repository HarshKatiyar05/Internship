public class Question {
  public static void main(String[] args) {
     int arr[]={1,1,1,2,2,3,4} ;
      int ansfirst = find_first_occurence(arr, 3) ;
      int anslast = find_Last_occurence(arr, 3) ;

     int count = 0 ;
     for(int i=ansfirst;i<=anslast;i++){
         count++;
     }
     System.out.println(count);
  }

  static int find_first_occurence(int arr[],int target){
     int s =0;
     int e = arr.length-1;
       int ans = -1;
       while(s<=e){
         int mid = s+(e-s)/2;
         if(target <= arr[mid]){
            ans = mid ;
            e = mid -1;
         }else{
          s = mid + 1;
         }
       }
       return ans ;
  }



   static int find_Last_occurence(int arr[],int target){
     int s =0;
     int e = arr.length-1;
       int ans = -1;
       while(s<=e){
         int mid = s+(e-s)/2;
         if(target >= arr[mid]){
            ans = mid ;
            s = mid +1;
         }else{
          e = mid - 1;
         }
       }
       return ans ;
  }
}
