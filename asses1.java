import java.util.Scanner;
// COMMENT LINE
public class asses1 {
    public static void main(String[] args) 
    {
        String a = new Scanner(System.in).nextLine().toUpperCase();
        int b = new Scanner(System.in).nextInt(),count=0;
        System.out.println((b%26)+65);
        char q = ((char)((b%26)+65));
        System.out.println(q);
        for(int i=0;i<a.length();i++)
        {
            System.out.println("12");
            if(q==a.charAt(i))
            {
                count++;
            }
        }
        if(count==1)
        {
            System.out.println("Stable");
        }
        else if(count==2)
        {
            System.out.println("Unstable");
        }
        else
        {
            System.out.println("0");
        }
    }
}
