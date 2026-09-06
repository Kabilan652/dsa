public class find2DArr {

    public static boolean findArr(int arr[][] ,int target){
        int row = 0;
        int col = arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return true;
            }
            else if(arr[row][col]>target){
                col=col-1;
            }
            else{
                row=row+1;
            }
        }
       
        return false;
    }
    public static void main(String []agrs){
        int arr [][]= {{1,4,6,8,10},{2,7,12,15},{3,11,20,22,24},{5,16,25,30,40}};
        int target = 1;
        boolean ans = findArr(arr , target);
        System.out.println(ans);
    }
}
