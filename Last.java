import java.util.*;
class Last{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n=in.nextInt();
        char a[]=new char[n];
        System.out.println("Enter Values: ");
        for(int i=0;i<n;i++)
        {
            a[i]=in.next().charAt(0);
        }
        //char a[]={'a','b','c','d','e','f','g','h','i','j','k'};
        Solve s=new Solve();
        char d=s.Done(a);
        System.out.println("The last element present is: "+d);
        in.close();
    }
}
class Solve{
    char Done(char a[])
    {
        int count=1;
        ArrayList<Character> al =new ArrayList<Character>();
        for (char b : a)
            al.add(b);
       int i=0;
      while(al.size()!=1)
      {
           if(i==al.size())
          {
            i=0;
            
          }
          if(count%4==0 || count%10==4)
          {
                al.remove(i);
                i=i-1;
          }
         
          count=count+1;
          i+=1;
      }
      char e=al.get(0);
      return e;
    }
}