import java.util.ArrayList;
import java.util.Scanner;
public class playfair 
{
    public static char m1[][] = new char[5][5];
    public static char m2[][] = new char[5][5];
    public static void main(String[] args)
    {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word ");
        String g = sc.nextLine().toLowerCase();
        String s[] = g.split(" ");
        String q = sc.next().toLowerCase();
        String aa="";
        int qq;
        for(int i=97;i<123;i++)
        {
            if(i==106)
                continue;
            qq=0;
            for(int j=0;j<q.length();j++)
            {
                if((char)i==q.charAt(j))
                {
                    qq=1;
                }
            }
            if(qq==0)
            {
                aa+=((char)i);
            }
        }
        q+=aa;
        m1=matrix(q);
        q=new StringBuffer(q).reverse().toString();
        m2=matrix(q);
        for(int i=0;i<s.length;i++)
        {
            method(s[i]);
            if(i!=s.length-1)
            System.out.print(" ");
        }
        
        for(int i=0;i<s.length;i++)
        {
            method(s[i]);
            if(i!=s.length-1)
            System.out.print(" ");
        }
        
    }catch(Exception e){}
}
    public static void code(int q,int[] b,char[][] m1,int i)
    {
        if(q==1)
        {
            System.out.print(m1[((b[0]%4)+1)][b[3]]+""+m1[((b[2]%4))+i][b[1]]);
        } 
        if(q==2)
        {   
            int j=1;
            if(b[3]==4)
            {
                j=0;
            }
            System.out.print(m1[b[2]][(b[1]%4)+i]+""+m1[b[0]][(b[3]%4)+j]);
        }
    }
    public static int[] change(int[] b)
    {
        for(int i=0;i<b.length;i++)
        {
        switch (b[i]) 
        {
            case 0: b[i]=4; break;
            case 1: b[i]=3; break;
            case 3: b[i]=1; break;
            case 4: b[i]=0; break;
            }
        }
        return b;
    }
    public static char[][] matrix(String q)
    {
        char mm[][] = new char[5][5];
        for(int s=0,ss=0;s<5;s++)
        {
            for(int t=0;t<5;t++,ss++)
            {
                mm[s][t]=q.charAt(ss);
                System.out.print(mm[s][t]);
            }
            System.out.println();
        }
        return mm;
    }
    public static void method(String g)
    {
        ArrayList<Character> al = new ArrayList();
        g = g.replace('j', 'i');
        if(g.length()%2!=0)
        {
            g+="x";
        } 
        for(int i=0;i<g.length();i++)
        {
            al.add(g.charAt(i));
        }
        int b[] = new int[4];
        for(int c=0;c<al.size();c+=2)
        {
            if(al.get(c)==al.get(c+1))
            {
                al.add(c+1, 'x');
            }
            for(int i=0;i<m1.length;i++)
            {
                for(int j=0;j<m1[i].length;j++)
                {
                    if(m1[i][j]==(al.get(c)))
                    {
                        b[0]=i;
                        b[1]=j;
                    }
                }
            }
            for(int i=0;i<m1.length;i++)
            {
                for(int j=0;j<m1[i].length;j++)
                {
                    if(m1[i][j]==(al.get(c+1)))
                    {
                        b[2]=i;
                        b[3]=j;
                    }
                }
            }
            if(b[1]==b[3])
            {
                if(b[0]<=b[2])
                {
                   code(1,b,m1,1);
                }
                else
                {
                    b=change(b);
                    code(1,b,m2,0);
                }
            }
            else if(b[0]==b[2])
            {
                if(b[1]<=b[3])
                {
                    code(2,b,m1,1);
                }
                else
                {
                    b=change(b);
                    code(2,b,m2,1);
                }
            }
            else
            {
                System.out.print(m1[b[0]][b[3]]+""+m1[b[2]][b[1]]);
            }
        }
    }
}