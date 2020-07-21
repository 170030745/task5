import java.util.Scanner;
public class task8
{
	public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string or text in Capitals");
	     String input = sc.next();
	     String res="";
	     for(int i=0;i<input.length();i++)
	     {
	        char a='A';
	        char ch=input.charAt(i);
	        if(i==0||i==1)
	        {
	            if(ch==a)
	            {
	                
	            }
	            else{
	                res=res+ch;
	            }
	        }
	        else{
	                res=res+ch;
	            }
	        
	     }
    System.out.println("Final String after operation is "+res);
	}
}