
import java.util.Scanner;

public class Ceasar 
{
    public static void main(String[] args) 
    {
        int a = new Scanner(System.in).nextInt();
        int k= (2*a)-1;
        for(int i=1;i<a;i++)
        {
            for(int j=0;j<k;j++)
            {
                if(j>(k/2)-i&&j<(k/2)+i)
                    System.out.print(i);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        int s=96;
        for(int i=a-2;i>=1;i--)
        {
            for(int j=k-1;j>=0;j--)
            {
                if(j>(k/2)-i&&j<(k/2)+i)
                    System.out.print((char)(i+s));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}