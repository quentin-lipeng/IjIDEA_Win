package TheBook;

import java.util.Calendar;

public class HashCodeTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        Integer a =1;
        String name = null;
        try{
            System.out.println(name);
        }catch (NullPointerException e){
            System.out.println("空指针");
        }finally {
            System.out.println("finally");
        }


    }
}
