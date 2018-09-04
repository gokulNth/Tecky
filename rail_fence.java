
import java.util.Scanner;

public class rail_fence 
{
    public static void main(String[] args) 
    {
        System.out.println("Text");
        char c[] = new Scanner(System.in).next().toCharArray();
        System.out.println("KEY");
        int a = new Scanner(System.in).nextInt();
        char c1[][] = new char[a][c.length];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<c.length;j++)
            {
                c1[i][j]='a';
            }
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<c.length;j++)
            {
                System.out.print(c1[i][j]);
            }
            System.out.println();
        }
    }
}
