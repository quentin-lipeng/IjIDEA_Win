package TheBook;

public class GenericTest {
    public static void main(String[] args) {
        Test<String> str = new Test<String>("lin");
        Test<Integer> inter = new Test<Integer>(1);
        System.out.println(str.getDate());
        System.out.println(str.getClass());
        System.out.println(inter.getDate());
        System.out.println(inter.getClass());
    }
}
class Test<E>{
    private E date;
    public Test(){}
    public Test(E e){
        this.date = e;
    }
    public E getDate(){
        return date;
    }
}
