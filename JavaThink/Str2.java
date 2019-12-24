package JavaThink;

public class Str2 {
    public static void main(String[] args) {
        String name = "Alan Turing";
        String upperName = name.toUpperCase();//@toUpperCase生成并返回新的字符串对象
        //System.out.println(upperName);

        String text = "Computer Science is fun";
        text = text.replace("Computer Science", "CS");
        System.out.println(text);
    }
}
