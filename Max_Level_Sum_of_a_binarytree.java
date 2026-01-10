import java.util.*;

class Solution {
    public int maxLevelSum(TreeNode root) 
    {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int level = 1;
        int maxSum = Integer.MIN_VALUE;
        int answerLevel = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int levelSum = 0;

            for (int i = 0; i < size; i++) 
            {
                TreeNode current = queue.poll();
                levelSum = levelSum + current.val;

                if (current.left != null) 
                {
                    queue.offer(current.left);
                }
                if (current.right != null) 
                {
                    queue.offer(current.right);
                }
            }

            if (levelSum > maxSum) 
            {
                maxSum = levelSum;
                answerLevel = level;
            }

            level++;
        }

        return answerLevel;
    }
}