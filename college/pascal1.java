/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

/**
 *
 * @author NC 2
 */
import java.util.Scanner;
public class pascal1 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int num=1;
        for(int i=0;i<r;i++)
        {
            for(int k=r;k>i;k--)
            {
                System.out.print(" ");
            }
            num=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println(" ");
        }
    }
    
}
