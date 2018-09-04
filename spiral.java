import java.util.Scanner;
public class spiral 
{
    public static int e=new Scanner(System.in).nextInt(),p=2;
    public static int a[][] = new int[e][e],k=1,y=e-2,y1=e,u=0;
    public static void main(String[] args) 
    {
        int max=Integer.toString(e*e).length();
        while(y>0)
        {
            for(int i=u;i<e;i++)
                a[u][i]=k++;
            for(int i=u+1;i<e;i++)
                a[i][e-1]=k++;
            for(int i=e-p;i>=u;i--)
                a[e-1][i]=k++;
            for(int i=e-p;i>=u+1;i--)
                a[i][u]=k++;
                e-=1; u++; y--;
        }
        for(int i=0;i<y1;i++)
        {
            for(int j=0;j<y1;j++)
            {
                System.out.print(a[i][j]);
                for(int q=0;q<=max-Integer.toString(a[i][j]).length();q++)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}