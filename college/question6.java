package college;
import java.util.Arrays;
import java.util.Scanner;

class question6 
{
    public static void main(String[] args) 
    {
        question6 q = new question6();
        Scanner sc = new Scanner(System.in);
        String a = "";
        for(int i=0;i<3;i++)
            a = a+sc.next();
        char[] c = a.toCharArray();
        Arrays.sort(c);
          int n = (int)c[0]-'0';
          int f = q.fact(n);
        System.out.println("Sum is : "+(f+n)+"  factorial of smallest no. is : "+f);
    }
    public int fact(int a)
    {
        int n = 1;
        for(int i=1;i<=a;i++)
        {
            n=n*i;
        }
        return n;
    }
}