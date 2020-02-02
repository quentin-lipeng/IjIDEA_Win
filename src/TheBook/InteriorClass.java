package TheBook;

public class InteriorClass {
    private String outData = "outData";
    private static String staData = "staData";
    public InteriorClass(){
        InterC inter = this.new InterC();
        inter.accessOut();
    }
    public void Class(){
        //匿名内部类 只能在方法内定义
        new Thread(){
            public void run(){

            }
        };//类体结束
    }

    public static void main(String[] args) {
        InteriorClass out = new InteriorClass();
    }
//成员内部类
    public class InterC{
        public InterC(){
            System.out.println("interAccess:");
        }
        public void accessOut(){
            System.out.println(InteriorClass.this.outData);
        }
    }
    //静态内部类 只能访问静态成员
    public static class StaClass{
        public StaClass(){
            System.out.println(InteriorClass.staData);
        }
    }
}
