import java.util.Scanner;
public class hill_cypher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ax=new String();
        ax=sc.nextLine();
        char[] a=ax.toCharArray();
        int a1[][]=new int[a.length][a.length];
        int b1[][]=new int[a.length][a.length];
        int given_mat[][]=new int[a.length][1];
        int cipher[][]=new int[a.length][1];
        char[] alphabets= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a1.length;j++)
            {
                a1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a1.length;j++)
            {
                b1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++)
        {
            int j=0;
            given_mat[i][j]=(a[i]-'0')-49;
        }
        int sum=0;
        for ( int c = 0 ; c < a.length ; c++ )
        {
           for ( int d = 0 ; d < 1 ; d++ )
           {  
              for ( int k = 0 ; k < a.length ; k++ )
              {
                 sum = sum + a1[c][k]*given_mat[k][d];

              }
              cipher[c][d] = sum%26;
               System.out.println(sum+"  "+sum%26);
              sum = 0;
           }
        }
        for(int i=0;i<a.length;i++)
        {
            int j=0;
            System.out.print(alphabets[cipher[i][j]]+" ");
        }
    }
}