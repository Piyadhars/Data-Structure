#THREE COINS SUM - GREEDY
import java.util.*;
public class Coing {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of the array: ");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Enter sum: ");
        int sum=in.nextInt();
        int r=sum;
        Arrays.sort(a);
        int count=0;
        for(int i=a.length-1;i>=0;i--)
        {
            while(r>=a[i])
            {
                r=r-a[i];
                count+=1;
            }
            if(r!=0 && a[i-1]>sum)
            {
                r=sum;
                count=0;
                continue;
            }
        }
        System.out.println("Minimum coins: "+count);
        in.close();

    }

}
