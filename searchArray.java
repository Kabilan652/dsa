    import java.util.Scanner;

    public class searchArray {

        public static int binarySearch(int arr[] , int left , int right, int target){
            while(left<=right){
                int mid = (left+right)/2;
                if(arr[mid]==target){
                    return mid;
                }
                else if(arr[mid]<target){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
            return -1;
        }
    
        
        public static int findMin(int[] arr){
            int left = 0 , right = arr.length -1 ;
            while (left<right) {
                int mid = (left+right)/2;
                if(arr[mid]<arr[right]){
                    right = mid;
                }
                else{
                    left = mid +1;
                }
                
            }
            return left;

        }
        public static void main (String args[]){
            int arr[] = {9,11,12,15,19,20,25,3,4,5,6};
            Scanner get = new Scanner(System.in);
            int target = get.nextInt();
            int minindx = findMin(arr);
            int ans = binarySearch(arr, 0,minindx-1, target);
            if(ans == -1){
               ans = binarySearch(arr , minindx, arr.length-1, target);
            }
            System.out.println(ans);

        }
    }
