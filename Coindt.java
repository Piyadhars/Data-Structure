#THREE COINS-TOPDOWN
import java.util.*;
public class Coindt {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);    
        Dynamic dp = new Dynamic();
        System.out.println("Enter no of coins value(length): ");
        int n=in.nextInt();
        int coins[]=new int[n];
        System.out.println("Enter coins values: ");
        for(int i=0;i<n;i++)
           coins[i]=in.nextInt();
        System.out.println("Enter the target sum: ");
        int S = in.nextInt();
        int ans[] = new int[100];
        int l = coins.length;
        int res = dp.TopDownApproach(S, coins, l, ans);
        System.out.println("The minimum coins is: "+res);
        in.close();
     }
 }
  class Dynamic{
    public int TopDownApproach(int n,int coins[],int l,int ans[]){
        if (n == 0){
            return 0;
        }
        if (ans[n] != 0){
            return ans[n];
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < l; i++){
            if (n - coins[i] >= 0){
                int val = TopDownApproach(n - coins[i], coins, l, ans);
                result = Math.min(result, val + 1);
        }
    }
    ans[n]=result;
    return result;
    }
}
