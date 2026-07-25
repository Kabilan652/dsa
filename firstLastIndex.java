public class firstLastIndex {

    public static void firstlast(int arr[] , int target){
     int left = 0 , right = arr.length-1;
     int first = -1;

     while(left<=right){
        int mid = (left+right)/2;
        if(arr[mid]==target){
            first = mid;
            right = mid-1;

        }
        else if(arr[mid]<target){
            left = mid+1;

        }else{
            right = mid-1;
        }
     }

     left = 0;
     right = arr.length-1;
     int last = -1;

     while(left<=right){
        int mid = (left+right)/2;
        if(arr[mid]==target){
            last = mid;
            left = mid+1;

        }
        else if(arr[mid]<target){
            left = mid+1;

        }else{
            right = mid-1;
        }
     }

    System.out.println(first + " "+ last);

    }



    public static void main(String []args){
        int [] arr = {1,2,3,4,5,5,5,6,6,6,7,7,7};
        firstlast(arr , 5);
    }
}