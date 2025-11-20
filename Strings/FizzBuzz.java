package Strings;
import java.util.List;
import java.util.ArrayList;
public class FizzBuzz {
    
    public static List<String> fizzBuzz(int n){
        List<String> result = new ArrayList<>();
        for(int i=1 ; i<=n;i++){
            if(i%3==0 && i%5==0){
                result.add("FizzBuzz");
            }
            else if(i%3==0){
                result.add("Fizz");
            }
            else if(i%5==0){
                result.add("Buzz");
            }
            else{
                result.add(Integer.toString(i));
            }
            
        }
        return result;
    }

    public static void main(String[] args) {
        // Input: n = 5
        // Output: ["1","2","Fizz","4","Buzz"]
        int n= 5;
        List<String> result = fizzBuzz(n);
        System.out.println(result);
    }


}
