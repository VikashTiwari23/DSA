package Strings;
public class ReverseString{
    public static void reverseString(char[] s){
        int left = 0;
        int right = s.length-1;
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
                left++;
                right--;
        }
    }

    public static void main(String[] args) {
        // Input: s = ["h","e","l","l","o"]
        // Output: ["o","l","l","e","h"]
        char [] input = {'h','e','l','l','o'};
        reverseString(input);
    }
}
