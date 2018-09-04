///package prp;
import java.util.Scanner;

public class triangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),num=0;
		for(int i=0;i<=a;i++)
                {
                    for(int j=1;j<=a-i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=0;j<(2*i)-1;j++)
                    {
                        if(j>((2*i)-1)/2)
                        {
                            System.out.print((char)(num+65)+""+num);
                            num=num*(i-j)/(j+1);
                        }
                        else
                        {
                            System.out.print(j+1);
                        }
                    }
                    System.out.println();
                }
                for(int i=a;i>=0;i--)
                {
                    for(int j=1;j<=a-i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=(2*i);j>=0;j--)
                    {
                        if(j<=(((2*i)-1)/2))
                        {
                            System.out.print(j+1);
                        }
                        else
                        {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
	}
}