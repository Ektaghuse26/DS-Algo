package doubleEndedQ;
import java.util.*;
public class SlidingWindow {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		int a[] = {4,3,1,2,5,3,4,7,1,9};
		int ans[] = solution.maxSlidingWindow(a, 4);
		for(int x: ans)
			System.out.print(x+" ");
	}
	
	static class Solution
	{
		public int[] maxSlidingWindow(int[] nums, int k) {
	        
	        int len = nums.length;
	        //deque in this case will only store the index of the largest elements
	        Deque<Integer> dq = new LinkedList<>();
	        int[] ans = new int[len-k+1];
	        int i;
	        for(i = 0; i < k; i++)
	        {
	            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i])
	            {
	                dq.removeLast();
	            }
	            dq.addLast(i);
	        }
	        
	        for(; i < len; i++)
	        {
	            ans[i - k] = nums[dq.peekFirst()];
	            while(!dq.isEmpty() && dq.peekFirst() <= i-k )
	                dq.removeFirst();   //added this in my final max list but need to remove                                            from my window for further iteration
	            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i])
	            {
	                dq.removeLast();
	            }
	            dq.addLast(i);    
	        }
	        ans[i - k] = nums[dq.peekFirst()];

	        
	        return ans;
	}
	}

}
