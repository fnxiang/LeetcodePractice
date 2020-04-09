#问题描述
#语句反转，将一句话去除空格后进行反转

#注意点：
#理解reversed方法 以及 python里面的string字串截取

class Solution(object):
    def reverseWords(self, s):
        word_list = s.split(" ")
        str = ""
        for word in reversed(word_list):
            if word != '':
               str = str + " " + word

        return str[1: len(str)]

solution = Solution()
print(solution.reverseWords("the sky is blue"))
print(solution.reverseWords("  hello world!  "))
print(solution.reverseWords("a good   example"))
print(solution.reverseWords("a"))
print(solution.reverseWords(" "))