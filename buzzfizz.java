
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class buzzfizz 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=50;i++)
        {
            if(i%3==0&&i%5==0)
            {
                System.out.println("fizzzbuzzz");
            }
            else if(i%3==0)
            {
                System.out.println("fizzz");
            }
            else if(i%5==0)
            {
                System.out.println("buzzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
