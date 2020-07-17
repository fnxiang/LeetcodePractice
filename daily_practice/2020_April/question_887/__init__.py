class Solution(object):
    def superEggDrop(self, K, N):
        low = 1
        high = dict()
        steps = 0

        while(1):
            if K == 1:
                steps = steps + high - low
                return steps

            if N == 1:
                return 1

            #终止条件
            if K > 2:
                high = int((high + low) /2)
                steps += 1
                K -= 1
            else:
                low = int((high + low) /2)
                steps += 1

            if high - low < 3 :
                steps += 2
                return steps


s = Solution()
#print(s.superEggDrop(1, 2))
#print(s.superEggDrop(1, 3))
#print(s.superEggDrop(3, 14))
print(s.superEggDrop(5, 16))
#print(s.superEggDrop(1, 4))