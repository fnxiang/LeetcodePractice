#判断子序列
class Solution(object):
    def isSubsequence(self, s, t):
        list_s = list(s)
        list_t = list(t)
        if len(list_s) == 0:
            return True
        start = 0
        count = 0
        flag = False
        for i in range(len(list_s)):
            for j in range(start, len(list_t)):
                if list_t[j] == list_s[i]:
                    flag = True
                    start = j+1
                    count += 1
                    break
        if flag is False or count != len(list_s):
                return False
        return True

solution = Solution()
print(solution.isSubsequence("abc", "ahbgdc"))