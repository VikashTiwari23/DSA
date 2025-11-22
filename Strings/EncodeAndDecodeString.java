package Strings;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class EncodeAndDecodeString {
    
    public static String Encode(List<String> list){
        if(list.size()==0){
            return Character.toString((char)258);
        }
        String seprate = Character.toString((char)257);
        StringBuilder sb = new StringBuilder();
        for(String s : list){
            sb.append(s);
            sb.append(seprate);
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public static List<String> Decode(String str){
        if(str.equals(Character.toString((char)258))){
            return new ArrayList<>();
        }
        String seprate = Character.toString((char)257);
        return (Arrays.asList(str.split(seprate)));
    }

        public static void main(String[] args) {
          List<String> list = Arrays.asList("abc","de","fg");
          String str = Encode(list);
          System.out.println("The encoded string is : "+str);
          List<String> result = Decode(str);
          System.out.println(result);
        }


}
