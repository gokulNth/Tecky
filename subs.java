import java.io.*;
import java.util.*;
public class subs {
    public static void main(String args[])
    {
        ArrayList ar = new ArrayList();
        for(int i=0;i<26;i++)
        {
            for(int j=i;j>=0;j--)
            {
                ar.add((char)(i+65));
            }
        }
        System.out.println(ar.get(new Scanner(System.in).nextInt()+1));
    }
}
