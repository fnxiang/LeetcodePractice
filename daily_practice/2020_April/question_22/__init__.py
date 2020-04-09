#问题描述
# 根据输入数字生成有效的括号组数

#注意点：
#右括号不能先出来！

class Solution(object):
    str = "("
    def generateParenthesis(self, n):
        list = []
        self.generateBracket(list, self.str, 0, 2*n-2)
        return list

    def generateBracket(self, list, bracket_string, flag, num):
        if(num > 0 and flag < 2):
            self.generateBracket(list, bracket_string + "(", flag-1, num-1)
            self.generateBracket(list, bracket_string + ")", flag+1, num-1)
        if num == 0 and flag == 0:
            list.append(bracket_string + ")")

solution = Solution()
solution.str = "("
print(solution.generateParenthesis(3))
print(solution.generateParenthesis(1))