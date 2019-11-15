import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class WordFrequency {
    public static void calc(List<String> input){
        TreeMap<String,Integer> fre = new TreeMap<>();
        for (String str :input){
            fre.put(str,fre.getOrDefault(str,0)+1);
        }
        for (String word:fre.keySet()){
            System.out.println(word+"|"+fre.get(word));
        }
    }

    public static void main(String[] args) {
        calc(Arrays.asList("abc","bac","abc"));
    }
}
