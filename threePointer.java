import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class threePointer{
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        List<List<Integer>> res = new ArrayList<>();
        
        Arrays.sort(arr);
        int len = arr.length;

        for(int i =0 ; i<len-2 ;i++){
            if(i>0 && arr[i] == arr[i-1]) continue;
            int l = i+1 ,r = len-1;
            while(l<r){
                int sum = arr[i] + arr[l] +arr[r];
                while(i<r && arr[i]==arr[l+1]) l++;
                while(i<r && arr[r]==arr[r-1]) r--;
                l++;
                r--;
                

                if(sum==0){
                    res.add(Arrays.asList(arr[i] , arr[l], arr[r])); 
                }
                else if(sum>0){
                    r--;
                }
                else{
                    l++;
                }
            }

        }
        System.out.println(res);

    }
}