package Strings;

public class ValidPallindrome {
    
    public static boolean isPallindrome(String str){
        if(str.length()==0){
            return false;
        }
        int left =0;
        int right = str.length()-1;
        while(left<right){
            while(left<right&&!Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }
            while(left<right&&!Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }
            while(left<right&&Character.toLowerCase(str.charAt(left))!=Character.toLowerCase(str.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean IsPallindrome = isPallindrome(str);
        System.out.println("Is this a Pallindromic string ? : "+IsPallindrome);
    }
    
}
