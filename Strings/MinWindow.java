package Strings;
import java.util.HashMap;


public class MinWindow {
    
    public static String minimumSubstring(String s , String t){
        if(s.length()<t.length()) return "";
        HashMap<Character,Integer> target = new HashMap<>();
        for(char c : t.toCharArray()){
            target.put(c,target.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> window = new HashMap<>();
        int left = 0 ;
        int right = 0;
        int formed = 0;
        int start = 0 ;
        int minLen = 10000;
        int required = target.size();
        while(right<s.length()){
            char c = s.charAt(right);
            window.put(c,window.getOrDefault(c,0 )+1);
            if(target.containsKey(c)&& target.get(c).intValue()==window.get(c).intValue()){
                formed++;
            }
            while(left<=right && formed ==required){
                if(right-left+1<minLen){
                    minLen = right-left+1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                window.put(leftChar,window.get(leftChar)-1);
                if(target.containsKey(leftChar)&&window.get(leftChar).intValue()<target.get(leftChar).intValue()){
                    formed--;
                }
                left++;
            }
            right++;
        }
        return minLen == 10000 ? "": s.substring(start,start+minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result =  minimumSubstring(s,t); 
        System.out.println(result);
    }


}
