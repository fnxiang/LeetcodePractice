package topQuestion;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s){
        //Set<Character> strings = new HashSet<>();
        String sub = "";
        int count = 0;
        for(int i=0;i<s.length();i++){
            int tmp = 0;
            if( sub.indexOf(s.charAt(i)) >= 0){
                sub = sub.substring(sub.indexOf(s.charAt(i))+1) + s.charAt(i);
            }else{
                sub += s.charAt(i);
                tmp = sub.length();
            }

            if(tmp >count)
                count = tmp;
        }
        return count;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring ob = new LengthOfLongestSubstring();
        int length = ob.lengthOfLongestSubstring("dvdf");
    }
}
