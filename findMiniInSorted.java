public class findMiniInSorted {
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
            return arr[left];

        }

    public static void main(String[] args) {
        int arr[]={7,8,9,10,2,3,4};
        int ans = findMin(arr);
        System.out.println(ans);
        System.out.println(args[0]);
    }
}
