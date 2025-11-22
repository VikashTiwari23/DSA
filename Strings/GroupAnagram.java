package Strings;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class GroupAnagram {
    

    public static List<List<String>> groupAnagram(String [] str){
        HashMap<String,List> map = new HashMap<>();
        for(String s : str){
            char [] letter = s.toCharArray();
            Arrays.sort(letter);
            String word = new String(letter);
            if(!map.containsKey(word)){
                map.put(word,new ArrayList<>());
            }
            map.get(word).add(s);
        }
        return new ArrayList<> (map.values());
    }

    public static void main(String[] args) {
        String [] str = {"eat","tea","tan","ate","nat","bat"}; 
        List<List<String>> list = groupAnagram(str);   
        System.out.println(list);
    }


}
