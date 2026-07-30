public class Hard_Question {
  static  int peakElement(int arr[]){
            int s=0;
            int n = arr.length;
            int e=n-1;
            while(s<e){
              int mid = s + (e-s)/2;
              if(arr[mid]>arr[mid+1]){
                    e = mid;
              }else{
                s=mid+1;
              }
            }
            return e ;
     }

    static int OrderAgno_binarySearch(int arr[], int s, int e,int target){

      boolean order = arr[s]<arr[e] ;

      while(s<=e){
          int mid = s+(e-s)/2 ;

          if(target==arr[mid]){
            return mid ;
          }
          if(order){
            if(target<arr[mid]){
               e = mid-1;
            }else{
              s= mid+1;
            }
          }else{
            if(target>arr[mid]){
              e = mid-1;
            }else{
              s = mid+1;
            }
          }
      }
      return -1;
      
    }
}
