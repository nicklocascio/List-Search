import java.util.*;
import java.io.*;

public class Runner
	{
	//static int counter = 1;
	
	public static int linear(int [] nums, int target)
		{
		for(int i = 0; i < nums.length; i++)
			{
			if(nums[i] == target)
				{
				return i;
				}
			//counter++;
			}
		return -1;
		}
	
	public static int binary(int[] nums, int target)
		{
		Arrays.sort(nums);
		int left = 0; 
		int right = nums.length-1;
		while(left <= right)
			{
			//counter++;
			int mid = (left + right)/2;
			if(nums[mid] == target)
				{
				return mid;
				}
			else if(nums[mid] < target)
				{
				left = mid + 1;
				}
			else
				{
				right = mid - 1;
				}
			}
		return -1;
		}
	
	public static void main(String [] args)
		{
		int[] nums = {4, 24, 6, 5, 34, 50, 39, 3, 10, 19, 18, 23, 21, 29, 33, 41, 32, 7, 17, 12};
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your target number?");
		int target = userInput.nextInt();
		
		//Just change method for linear or binary
		if(linear(nums, target) == -1)
			{
			System.out.println(target + " is not in the list.");
			}
		else
			{
			System.out.println(target + " is item " + linear(nums, target) + " in the list.");
			}
		}
	}
