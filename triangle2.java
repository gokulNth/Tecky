import java.util.Scanner;
public class triangle2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s1[] = new String[]{sc.next()/*,sc.next(),sc.next()*/};
        String a1="";
        String a2="";
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i].length()%3==0)
            {
                for(int j=0,q=0,w=3;j<s1[i].length()/3;j++)
                {
                    a1 = a1 + s1[i].substring(q, w)+" ";
                    q+=3;w+=3;
                }
            }
            else if((s1[i].length()%3)==1)
            {
                for(int j=0,q=-1,w=0;j<3;j++)
                {
                    q+=1;w+=1;
                    if(j%2!=0)
                    {
                        w+=1;
                        a2 = a2 + s1[i].substring(q, w)+" ";
                        q+=1;
                    }
                    else
                    {
                        a2 = a2 + s1[i].substring(q, w)+" ";
                    }
                }
            }
            else if((s1[i].length()%3)==2)
            {
                for(int j=0,q=-1,w=0;j<3;j++)
                {
                    q+=1;w+=1;
                    if(j%2==0)
                    {
                        w+=1;
                        a2 = a2 + s1[i].substring(q, w)+" ";
                        q+=1;
                    }
                    else
                    {
                        a2 = a2 + s1[i].substring(q, w)+" ";
                    }
                }
            }
        }
        System.out.println(a1+"       "+a2);
    }
}