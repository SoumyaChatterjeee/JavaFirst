import java.util.Scanner;
class RevAstring
{
	String str;
	RevAstring(String str)
	{
		this.str=str;
	}
	public void reverseString()
	{
		int len=str.length();String revstr="";
		for(int i=(len-1);i>=0;i--)
		{
			revstr=revstr+(str.charAt(i));
			
		}
		System.out.println("The reversed string is="+" "+revstr);
		}
}
public class StringRev {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to be reversed");
		s=sc.nextLine();
		RevAstring ob=new RevAstring(s);
		ob.reverseString();
		sc.close();
		}

}
