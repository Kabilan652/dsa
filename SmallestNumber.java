import java.util.Scanner;

public class SmallestNumber {
    public static int solution(int n){
        String ans = "";
        if (n == 1) {
            return 1;
        }
        for (int div=9;div>=2;div--){
            while(n % div ==0){
                n = n / div;
                ans = div+ans;
            }
        }
        if(n!=1){
            return -1;
        }
        else{
            return Integer.parseInt(ans);
        }
    }

    public static void main (String[] args){
        Scanner get = new Scanner(System.in);
        int n = get.nextInt();
        System.out.println(solution(n));

    }
    
}
