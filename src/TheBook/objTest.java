package TheBook;

public class objTest {
    public static void main(String[] args) {
        //只能实例化构造函数
        otherTest su = new otherTest();
        otherTest su1 = new otherTest(1);
        su1.method1();
    }
}
class otherTest{
    public otherTest(){
        System.out.println("无参构造器");
    }
    public otherTest(int a){
        System.out.println("有参构造器"+a);
    }
    public void method1(){
        System.out.println("自定义方法");
    }
}
