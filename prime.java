import java.util.Scanner;

public class prime 
{
    public static void main(String args[])
    {
        Scanner sb=new Scanner(System.in);
        int n,a,c,count=0;
        n=sb.nextInt();
        
        for(a=2;a<=n;a++)
        {c=0;
                  
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                c++;
            }
        }
            if(c==2)
            {
               
               count++;
            
            }
            
        }    System.out.println(count);
    }
    
}





