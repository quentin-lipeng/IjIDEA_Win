package TheBook;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Next();
    }
    public static void Next(){
        Collection books = new HashSet();
        books.add("a");
        books.add("b");
        books.add("c");
        Iterator it = books.iterator();
        while (it.hasNext()){
            String book = (String)it.next();
            System.out.println(book);
            //修改迭代变量对集合元素本身不受影响
            book = "test";
            if(book.equals("c")){
                books.remove(book);
            }
        }
        System.out.println(books);
    }
}
