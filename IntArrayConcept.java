public class IntArrayConcept
{
	public static void main(String... args)
	{
		//1. Int Array
		int i[]=new int[5];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		//lowest bound/index=0
		//upper bound/index=n-1 where n is size of an array
		
		//Print the value of an array
		System.out.println(i[0]);
		System.out.println(i[1]);
		
		//Print the length of an array
		int arr =i.length;
		System.out.println("length of an array: "+arr);
		
		//print all the value of an array ::Using for loop
			for(int j=0;j<i.length;j++)
			{
				System.out.println("value of an array "+i[j]);
			}
		
		//double array
		double d[]=new double[3];
		d[0]=10.21;
		d[1]=11.22;
		d[2]=12.23;
		System.out.println(d[1]);
		double arr1=d.length;
		System.out.println("Double array length: "+arr1);
		//Print the value of Double Array
		for(int a=0;a<d.length;a++)
		{
			System.out.println("Value of double arrray: "+d[a]);
		}
		
		//Char Array
		char ch[]=new char[3];
		ch[0]='a';
		ch[1]=2;
		ch[2]='5';
		System.out.println(ch[1]);
		int arr2=ch.length;
		System.out.println("length of Char array: "+arr2);
		//Print the value of Double Array
		for(int b=0;b<ch.length;b++)
		{
			System.out.println("Value of Char "+ch[b]);
		}
		
		//boolean array
		boolean boo[]=new boolean[2];
		boo[0]=true;
		boo[1]=false;
		System.out.println(boo[1]);
		System.out.println("length of boolean array: "+boo.length);
		
		//String array
		String s[]=new String[3];
		s[0]="Ram";
		s[1]="Hello";
		s[2]="HRU";
		System.out.println(s[2]);
		System.out.println("length of string array: "+s.length);
		//Print the value of String Array
		for(int c=0;c<s.length;c++)
		{
			System.out.println("Value of string array: "+s[c]);
		}
		
		//Object array(Object is a class)
		Object ob[]=new Object[3];
		ob[0]=2;
		ob[1]="Hello";
		ob[2]='M';
		System.out.println(ob[2]);
		System.out.println("Length of Object array: "+ob.length);
		//Print the value of Object Array
		for(int e=0;e<ob.length;e++)
		{
			System.out.println("Value of Object array: "+ob[e]);
		}

		}
}