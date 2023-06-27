
public class FirstRepeatingChar {

	public static int firstRepeatIndx(String s)
	{
		int idx= -1;
		for(int i=0;i< s.length()-1;i++)
		{
			for(int j=i+1;j< s.length();j++)
			{
			    if(s.charAt(i)==s.charAt(j))
			    {
			        idx= i;
			    	break;
			    }
			}
			if(idx>-1)
			{
				break;
			}
		}
		return idx;
	}
	public static void main(String[] args) {
		String s="loveleetcode";
		System.out.println("the first repetitive character occurs at "+ firstRepeatIndx(s));

	}

}
