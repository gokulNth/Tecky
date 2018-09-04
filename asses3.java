import java.util.Scanner;
public class asses3 
{
    public static void main(String[] args) 
    {try{
        char a[] = {'!','@','#','$','%','^','&','*','(',')'};
        String name = new Scanner(System.in).next(),num = new Scanner(System.in).next();int q=0;
        q=(num.charAt(0)-'0')+(num.charAt(1)-'0')+(num.charAt(2)-'0');
        if(String.valueOf(q).length()==2) q=String.valueOf(q).charAt(0)-'0'+String.valueOf(q).charAt(1)-'0';
        System.out.println(q+""+a[q-1]+""+String.valueOf(num).charAt(1)+""+name.charAt(name.length()-1));}
    catch(Exception e){System.out.println("Invalid");}
    }
}