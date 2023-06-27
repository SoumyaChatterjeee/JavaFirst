
public class MoveZeroes {

	public static int[] moveToLast(int nums[])
	{
		int count= 0,temp=0;
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i]!= 0)
			{
				temp= nums[count];
				nums[count]= nums[i];
				nums[i]= temp;
				count++;
			}
		}
		return nums;
	}
	public static void main(String[] args) {
		int nums[]= {0,1,0,3,12};
		moveToLast(nums);
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]+" ");
		}
		

	}

}
