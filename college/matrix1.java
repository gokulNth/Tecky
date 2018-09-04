package college;
public class matrix1 
{
    public static void main(String[] args) 
    {
        int a[][] = new int[3][3];
        int q=3,w=3;
        int o=0;
        for(int i=0;i<q;i++)
        {
            for(int j=0;j<w;j++)
            {
                if(i==0)
                {
                    System.out.print(++o);
                }
            }
            System.out.println();
        }
    }
}
