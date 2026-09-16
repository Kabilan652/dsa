import java.util.Arrays;
import java.util.Scanner;
class moveZero{
    public static void main(String args[]){
        Scanner get = new Scanner(System.in);
        int len;
        System.out.println("Enter the array lenght");
        len = get.nextInt();
        int arr[]=new int[len] ;
        for (int i = 0; i<len;i++){
            System.out.println("Enter the number with Zero");
            arr[i]=get.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int left=0;
        int right=0;

        for(int i=0;i<len;i++){
            if(arr[i]==0){
                right++;
            }
            if(arr[i]!=0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                right++;
                left++;
               
            }

        }
        System.out.println(Arrays.toString(arr));
        // System.out.println(moveZer(arr));
        
    }
}