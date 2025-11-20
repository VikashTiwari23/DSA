package Strings;
import java.util.HashSet;


public  class LongestSubstringWithoutRepeating {
    
    public static int longestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for(int right = 0 ;right<s.length();right++){
            char currentChar = s.charAt(right);
            while(set.contains(currentChar)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentChar);
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }



    public static void main(String[] args) {
        String str ="abcabcbb";
        int length = longestSubstring(str);
        System.out.println(length);
    }


}
