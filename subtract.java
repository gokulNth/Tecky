import java.util.Scanner;
public class subtract 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b="";
        a=sub(a);
        while(a.length()!=1)
        {
            a=sub(a);
        }
        System.out.println(a);
    }
    public static String sub(String q)
    {
        String s="";
        for(int i=0;i<q.length()-1;i++)
        {
            if(((q.charAt(i)-'0')<(q.charAt(i+1)-'0')))
            {
                s+=(q.charAt(i+1)-'0')-(q.charAt(i)-'0');
                System.out.println((q.charAt(i+1)-'0')+"_"+(q.charAt(i)-'0')+" ");
            }
            else if(((q.charAt(i)-'0')>(q.charAt(i+1)-'0')))
            {
                s+=(q.charAt(i)-'0')-(q.charAt(i+1)-'0');
                System.out.println((q.charAt(i)-'0')+"_"+(q.charAt(i+1)-'0')+" ");
            }
            else
            {
                s+=(q.charAt(i)-'0')-(q.charAt(i+1)-'0');
                System.out.println((q.charAt(i+1)-'0')+"_"+(q.charAt(i)-'0')+" ");
            }
        }
        return s;
    }
}