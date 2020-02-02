package TheBook;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {

    }


    //add()方法
    public static void AddMethod(){
        Collection c = new ArrayList();
        //加<String> 称为泛型 这样集合中只能存储String
        Collection<String> s = new ArrayList<>();
        c.add("a");
        c.add("b");
        System.out.println(c);
    }
}
