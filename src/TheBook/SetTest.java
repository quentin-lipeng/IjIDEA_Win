package TheBook;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet< >();
        String[] arr = {"i", "a", "i", "b", "i", "c"};
        for (String str : arr){
            if(!set.add(str)){
                System.out.println("重复的"+str);
            }
        }
        System.out.println(set.size()+"个数"+set);
    }
}
