package college;
import java.util.Arrays;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        String s[]=new Scanner(System.in).next().split("[A-Za-z]");
        int a=0;
        for(int i=1;i<s.length;i++){
            a+=Integer.parseInt(s[i]);
        }
        System.out.println(a);
        System.out.print(s.length);
    }    
}