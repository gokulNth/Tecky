
import java.util.Scanner;

public class triangle3 
{
    public static void main(String[] args) 
    {
        int a = new Scanner(System.in).nextInt();
        int k= (2*a)-1,b=-1,c=0,n=9;//a=4,k=7
        for(int i=1;i<=a;i++)
        {
            b+=2;//1
            for(int j=0;j<k;j++)
            {
                if(j==k/2)
                {
                    if(b%n==0)
                    System.out.print(n);
                    else
                    {
                        System.out.print(b%n);
                    }
                }
                else if (j>(k/2)-(i)&&j<(k/2)+(i)&&j!=k/2)
                {
                    int d= Math.abs(j - (k/2));
                    if((b-d)%9==0)
                        System.out.print(n);
                    else
                        System.out.print((b-d)%9);
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
