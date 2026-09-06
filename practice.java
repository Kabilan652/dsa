import java.util.Arrays;

class practice{
    public static void main(String args[]){
        int []arr={10,4,8,99,63,75,12,1,2,3,5};
        Arrays.sort(arr);
        int left=0;
        int right = arr.length-1;
        int target=15;
    while (left<right) {
        int current=arr[left]+arr[right];
        if(current==target){
            System.err.println(arr[left]);
            System.err.println(arr[right]);
           
        }
        else if(current>target){
            right--;
        }
        else{
            left++;
        }
       
        
    }}
}