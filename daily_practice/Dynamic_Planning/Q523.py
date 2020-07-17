class Solution(object):
    def checkSubarraySum(self, nums, k):
        sum = [0]*len(nums)
        if len(nums) < 2:
            return False
        sum[0] = nums[0]
        for i in range(1, len(nums)):
            sum[i] = sum[i-1] + nums[i]
        for start in range(len(nums)):
            for j in range(2, len(nums)+1):
                if start+j-1 <len(nums):
                    sum_num = sum[start+j-1] - sum[start] + nums[start]
                    if sum_num == k or (k != 0 and sum_num % k == 0):
                        return True
        return False
solution  = Solution()
print(solution.checkSubarraySum([0,0], 0))