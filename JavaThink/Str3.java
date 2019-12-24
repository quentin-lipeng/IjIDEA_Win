package JavaThink;

public class Str3 {
    public static void main(String[] args) {
        Str1 t1 = new Str1();
        t1.fruit = "banana";
        String fruit = t1.fruit;

//        for (int i=0;i<fruit.length(); i++) {
//            char letter = fruit.charAt(i);    //以为@charAt是一个方法所以要指定空的实参列表
//            System.out.print(letter+"\t");
//        }
//        for (char letter : fruit.toCharArray()) {
//            System.out.print(letter+"\t");
//        }

        //int length = fruit.length();
        char last = fruit.charAt(fruit.length()-1);
        //System.out.println(last);

        System.out.println(reverse("apple"));
    }
    public static String reverse(String s) {
        String r = "";
        for (int i=s.length()-1; i>=0; i--) {
            r = r + s.charAt(i)+'\t';
        }
        return r;
    }
}
