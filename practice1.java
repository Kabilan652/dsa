
class practice{
    public static void main(String args[]){ 
        
        int [] arr ={1,2,3,4,5,6,7,8};
        for(int i =0 ;i<7 ;i++){
            for(int j =1 ;j<7 ;j++){
                if(arr[i]+arr[j] == 5){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            
            }
        }

    }
}