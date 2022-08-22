import java.util.*;
public class MergeSort {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter values of array: ");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        //int a[]={21,12,1,31,24,54,44,43,2};
        int l=a.length;
        MSort m=new MSort();
        m.print(a,l);
        System.out.println();
        m.mergesort(a,0,l-1);
        m.print(a,l);
        in.close();
    }
}
class MSort{
    void mergesort(int a[],int beg,int end)
    {
        if(beg<end)
        {
            int mid=(beg+end)/2;
            mergesort(a,beg,mid);
            mergesort(a,mid+1,end);
            merge(a,beg,mid,end);
        }
    }
    void merge(int a[],int beg,int mid,int end)
    {
        int i,j,k;
        int n1=mid-beg+1;
        int n2=end-mid;
        int La[]=new int[n1];
        int Ra[]=new int[n2];
        for(i=0;i<n1;i++)
           La[i]=a[beg+i];
        for(j=0;j<n2;j++)
           Ra[j]=a[mid+j+1];
        i=0;
        j=0;
        k=beg;   
        while(i<n1 && j<n2)
        {
            if(La[i]<=Ra[j])
            {
                a[k]=La[i];
                i++;
            }
            else{
                a[k]=Ra[j];
                j++;
            }
            k++;
        }   
        while(i<n1)
        {
            a[k]=La[i];
            i++;
            k++;
        }   
        while(j<n2)
        {
            a[k]=Ra[j];
            j++;
            k++;
        }   
    }
    void print(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}