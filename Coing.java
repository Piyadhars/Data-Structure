import java.util.*;
public class Coing {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Enter sum: ");
        int sum=in.nextInt();
        Arrays.sort(a);
        int count=0;
        for(int i=a.length-1;i>=0;i--)
        {
            if(sum>=a[i])
            {
                sum=sum-a[i];
                count+=1;
            }
        }
        System.out.println("Minimum coins: "+count);
        in.close();

    }

}
