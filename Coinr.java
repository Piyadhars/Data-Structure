import java.util.*;
public class Coinr
{
    
    public static int Solve(int[] S, int target)
    {
        if (target == 0) {
            return 0;
        }
 
        if (target < 0) {
            return Integer.MAX_VALUE;
        }
 
        int coins = Integer.MAX_VALUE;
        //System.out.println(coins);
        for (int c: S)
        {
            int result = Solve(S, target - c);
 
            if (result != Integer.MAX_VALUE) {
                coins = Integer.min(coins, result + 1);
            }
        }
 
        return coins;
    }
 
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of coins value(length): ");
        int n=in.nextInt();
        int coins[]=new int[n];
        System.out.println("Enter coins values: ");
        for(int i=0;i<n;i++)
          coins[i]=in.nextInt();
        System.out.println("Enter the target sum: ");
        int S = in.nextInt();
 
        int ncoin = Solve(coins, S);
        if (ncoin != Integer.MAX_VALUE)
        {
            System.out.println("The minimum number of coins: "+ ncoin);
        }
        else
        {
            System.out.println("The solution does not exist");
        }
        in.close();
    }
}