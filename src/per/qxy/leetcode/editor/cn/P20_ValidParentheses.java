//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 每个右括号都有一个对应的相同类型的左括号。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁴ 
// s 仅由括号 '()[]{}' 组成 
// 
//
// Related Topics 栈 字符串 👍 3549 👎 0


package per.qxy.leetcode.editor.cn;

import java.util.Stack;

/**
 * 有效的括号
 * @author DY
 * @date 2022-10-14 09:42:57
 */
public class P20_ValidParentheses{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P20_ValidParentheses().new Solution();
		 System.out.println(solution.isValid("([}}])"));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
		char[] chars = s.toCharArray();
		Stack<Character> verification = new Stack<>();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '(') {
				verification.push(')');
			}
			else if (chars[i] == '[') {
				verification.push(']');
			}
			else if (chars[i] == '{') {
				verification.push('}');
			}
			//上面排除了三种左括号，如果都被过滤说明压入的是右括号，第一个右括号肯定是要与栈顶
			// 左括号匹配，否则直接 false 当栈为空但是循环没走完 说明有多余的右括号
			else if (verification.isEmpty() || verification.peek() != chars[i]) {
				return false;
			}  else {
				verification.pop();
			}
		}
		return verification.isEmpty();
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
