//给定一个二叉树，找出其最小深度。 
//
// 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。 
//
// 说明：叶子节点是指没有子节点的节点。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：root = [2,null,3,null,4,null,5,null,6]
//输出：5
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数的范围在 [0, 10⁵] 内 
// -1000 <= Node.val <= 1000 
// 
//
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 854 👎 0


package per.qxy.leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 二叉树的最小深度
 *
 * @author DY
 * @date 2022-10-14 15:47:02
 */
public class P111_MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P111_MinimumDepthOfBinaryTree().new Solution();
		TreeNode tree = TreeNode.createTree(new Integer[]{1,2,3,4,5});
		int i = solution.minDepth(tree);


	}

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public int minDepth(TreeNode root) {
			Integer result = 0;
			Queue<TreeNode> queue = new LinkedList<>();
			if (root == null) {
				return result;
			}
			queue.add(root);
			while (queue.size() > 0) {
				int size = queue.size();
				for (int i = 0; i < size; i++) {
					TreeNode peek = queue.remove();
					assert peek != null;
					if (peek.left == null && peek.right == null) {
						queue.clear();
						break;
					}
					if (peek.left != null) {
						queue.add(peek.left);
					}
					if (peek.right != null) {
						queue.add(peek.right);
					}
				}
				//每经过一次for循环代表进行了一层遍历
				result ++;
			}
			return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
