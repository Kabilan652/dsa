public class majority {

    public static int findMajorityElement(int arr[] , int n){
        int candidate = arr[0];
        int count = 1;

        for (int i=1 ; i<n ;i++){
            if(arr[i] == candidate){
                count++;
            }
            else{
                count--;
            }

            if(count ==0){
                candidate = arr[i];
                count=1;
            }

        }
        count=0;
        for(int val : arr){
            if(val == candidate){
                count++;
            }
        }
        if(count > n/2){
            return candidate;
        }
        else{
            return -1;
        }
    } 

    public static void main(String[] args){
        int[] arr = {7,8,9,9,4,8,9,9,5,6,9,9,9};
        System.out.println(findMajorityElement(arr, arr.length));
        System.out.println(arr.length);
    }
    
}
