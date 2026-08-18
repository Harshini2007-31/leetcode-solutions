import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] ans = new int[nums.length - k + 1];
        Deque<Integer> q = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {

            if (!q.isEmpty() && q.peek() <= i - k)
                q.remove();

            while (!q.isEmpty() && nums[q.peekLast()] < nums[i])
                q.removeLast();

            q.add(i);

            if (i >= k - 1)
                ans[i - k + 1] = nums[q.peek()];
        }

        return ans;
    }
}