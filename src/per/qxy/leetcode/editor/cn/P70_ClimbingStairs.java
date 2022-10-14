//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。 
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 2
//输出：2
//解释：有两种方法可以爬到楼顶。
//1. 1 阶 + 1 阶
//2. 2 阶 
//
// 示例 2： 
//
// 
//输入：n = 3
//输出：3
//解释：有三种方法可以爬到楼顶。
//1. 1 阶 + 1 阶 + 1 阶
//2. 1 阶 + 2 阶
//3. 2 阶 + 1 阶
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 45 
// 
//
// Related Topics 记忆化搜索 数学 动态规划 👍 2687 👎 0


package per.qxy.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 爬楼梯
 * @author DY
 * @date 2022-10-14 09:37:44
 */
public class P70_ClimbingStairs{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P70_ClimbingStairs().new Solution();
		 for (int i = 1; i <= 10; i++) {
			 System.out.println(solution.climbStairs(i));
		 }

	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs(int n) {
		List<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
		if (n > 2) {
			for (int i = 2; i <= n; i++) {
				integers.add(integers.get(i - 2) + integers.get(i - 1));
			}
		}
		return integers.get(n-1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
