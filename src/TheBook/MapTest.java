package TheBook;

import java.util.Hashtable;

public class MapTest {
    public static void main(String[] args) {
        Hashtable num = new Hashtable();
        num.put("one",new Integer(1));
        num.put("two",new Integer(2));
        num.put("three",new Integer(3));
        Integer inter = (Integer)num.get("one");
        System.out.println(inter);
    }
}
