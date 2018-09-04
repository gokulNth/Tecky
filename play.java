import java.util.ArrayList;
import java.util.Scanner;
public class play
{
    public static char m1[][] = new char[5][5];
    public static char m2[][] = new char[5][5];
    public static String y="";
    public static void main(String[] args)throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word ");
        String g = sc.nextLine().toLowerCase();
        String s[] = g.split(" ");
        String q = sc.next().toLowerCase();
        String aa="",x="";
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
            x+=method(s[i],1)+" ";
        }
        System.out.println(x);
        s = x.split(" ");
        x="";
        for(int i=0;i<s.length;i++)
        {
            x+=method(s[i],2)+" ";
        }
        System.out.println(x);
}
    public static String code(int q,int[] b,char[][] m1,int i)
    {
        String h="";
        if(q==1)
        {
            int j=1;
            if(b[2]==4)
            {
                j=0;
            }
            h = m1[((b[0]%4)+i)][b[3]]+""+m1[((b[2]%4))+j][b[1]];
        }
        if(q==2)
        {   
            int j=1;
            if(b[3]==4)
            {
                j=0;
            }
            h = m1[b[2]][(b[1]%4)+i]+""+m1[b[0]][(b[3]%4)+j];
        }
        return h;
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
    public static String reve(String a)
    {
        char c[] = a.toCharArray();
        for(int i=0;i<c.length-1;i+=2)
        {
            char temp=c[i+1];
            c[i+1]=c[i];
            c[i]=temp;
        }
        return String.valueOf(c);
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
        System.out.println();
        return mm;
    }
    public static String method(String g,int zz)
    {
        String q = "";
        String q1 = "";
        ArrayList<Character> al = new ArrayList();
        g = g.replace('j', 'i');
        if(g.length()%2!=0)
            g+="x";
        for(int i=0;i<g.length();i++)
            al.add(g.charAt(i));
        int b[] = new int[4];
        for(int c=0;c<al.size()-1;c+=2)
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
                    if(m1[i][j]==(al.get(c+1)))
                    {
                        b[2]=i;
                        b[3]=j;
                    }
                }
            }
            if(b[1]==b[3])//vertical
            {
                if(b[0]<=b[2])//forward
                {
                    q+=code(1,b,m1,1);
//                    q+="1";
                }
                else//backward
                {
                    b=change(b);
                    q+=code(1,b,m2,1);
//                    q+="2";
                }
            }
            else if(b[0]==b[2])//horizontal
            {
                if(b[1]<=b[3])//forward
                {
                    if(zz==2)
                    {
                        for(int i=0;i<b.length-2;i++)
                        {
                            int qq=b[i+2];
                            b[i+2]=b[i];
                            b[i]=qq;
                        }
                        q+=code(2,b,m1,1);
//                        q+="3";
                    }
                    else
                    {
                        q+=code(2,b,m1,1);
//                        q+="3";
                    }
                }
                else//backward
                {
                    b=change(b);
                    q+=code(2,b,m2,1);
//                    q+="4";
                }
            }
            else
            {
                q+=m1[b[0]][b[3]]+""+m1[b[2]][b[1]];
//                q+="5";
            }
        }
        /*if(zz==2)
        {
        String aa="";
        for(int i=0;i<q.length()-1;i+=2)
        {
            aa+=String.valueOf(q.charAt(i+1))+String.valueOf(q.charAt(i));
        }
        q=aa;
        }*/
        return q;
    }
}