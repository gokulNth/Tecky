package college;
import java.util.Scanner;
public class Caesar_cipher    
{
    public static void main(String[] args) 
    {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	char ch[]=sc.nextLine().toLowerCase().toCharArray();
	int k=sc.nextInt();
	char c[]=new char[1];
	char b[]=new char[ch.length];
	char f[]=new char[b.length];
	char alphabets[] = new char[26];
	for(int i=97,o=0;i<123;i++,o++)
	{
	    alphabets[o]=(char)i;
	}
        for(int i=0;i<ch.length;i++)
	{
            if(ch[i]==' ')
            {
                System.out.print(" ");
                continue; 
            }
            else
            {
		for(int j=0;j<alphabets.length;j++)
		{
		    if(ch[i]==alphabets[j])
        	    {
			f[i]=alphabets[(j+k)%26];
			System.out.print(f[i]);
                     	break;
                    }
                }
            }
        }
	System.out.println();
	for(int i=0;i<ch.length;i++)
	{
            if(ch[i]==' ')
            {
                System.out.print(" ");
                continue; 
            }
            else
            {
            	for(int j=0;j<alphabets.length;j++)
		{
	       	    if(f[i]==alphabets[j])
           	    {
                    	System.out.print(alphabets[(Math.abs(j-k))%26]);
			break;
                    }
                }
            }
        }
    }
}