/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprgms;
import java.util.*;
/**
 *
 * @author yaso
 */
public class JavaPrgms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     int num=0;
     int res=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a limit");
     num=sc.nextInt();
     for(int i=0;i<=num;i++)
     {
        res=res+i; 
     }
     System.out.println("sum is:"+res);
    }
}
