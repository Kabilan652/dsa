import java.util.Arrays;
public class sortColor {

    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    };git
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        int start = 0;
        int mid =0;
        int end = arr.length-1;
        
        
        
        while(mid<=end){
            switch (arr[mid]) {
                case 0:
                    swap(arr,mid,start);
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr , mid , end);
                    end--;
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}