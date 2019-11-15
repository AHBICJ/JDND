import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static List<String>[] groupString(List<String> input) {
        List<String>[] ans = new List[26];
        for (int i=0;i<26;i++) ans[i]= new ArrayList<>();
        for (String in : input) {
            ans[in.charAt(0)-'a'].add(in);
        }
        return ans;
    }
    public static void main(String[] args) {
        List<String> input = Arrays.asList("abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbbb", "eeee");
        for (List<String> list : groupString(input)) {
            if (list.size()!=0){
                System.out.println(list);
                System.out.println();
            }
        }
    }
}
