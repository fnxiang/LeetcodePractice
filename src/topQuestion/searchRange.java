package topQuestion;

public class searchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int head = 0, last = nums.length-1;
        Boolean flag = false;
        while(head <= last){
            int mid = (head + last)/2;
            if(nums[mid] == target){
                head = mid;
                last = mid;
                flag = true;
                break;
            }else if(nums[mid] < target){
                head = mid+1;
            }else{
                last = mid-1;
            }
        }

        if(flag){
            while(head !=0 && target == nums[head-1]) head--;
            while (last!= nums.length-1 && target == nums[last+1]) last++;
            result[0] = head;
            result[1] = last;
        }

        return result;
    }
}
