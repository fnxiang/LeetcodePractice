#可以理解为求最大的面积，

class Solution(object):
    def maxArea(self, height):
        area = 0
        i = 0
        j = len(height)-1
        while(i < j):
            h = min(height[i], height[j])
            area = max(area, h*(j-i))
            if height[i] < height[j]:
                i+=1
            else:
                j-=1
        return area

s = Solution()
height = [1,8,6,2,5,4,8,3,7]
print(s.maxArea(height))