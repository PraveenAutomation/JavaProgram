import java.util.Scanner;
public class PrimeNo
{
public static void main(String... args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number:");
	int no=s.nextInt(),tmp=0;
	for(int i=2;i<=no-1;i++)
	{
	if(no%i==0)
	{
		tmp=tmp+1;
	
	}
	}
	if(tmp==0)
	{
		System.out.println(no+" is Prime no");
	}
	else
	{
		System.out.println(no+"is Not a Prime no");
	}
	}
}
