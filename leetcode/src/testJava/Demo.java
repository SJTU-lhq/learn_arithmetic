package testJava;

/**
 * @author lihaiquan (lihq@rd.netease.com)
 * @description:
 * @date 2023/8/3 21:03
 */
public class Demo {
    public static void main(String[] args) {
        Wy wy = new Lhq();
        System.out.println(wy.a);
        //wy.start();
        wy.test();
        wy.test1();
    }

    public static class Wy{
        public int a = 2325;
        public Wy(){};
        public void start(){
            System.out.println("wy love lhq");
        }

        private void test(){
            System.out.println("WY");
        }
        public static void test1(){
            System.out.println("WY");
        }
    }

    public static class Lhq extends Wy{
        public int a = 817;
        public Lhq(){};
        public void start(){
            System.out.println("lhq love wy");
        }
        private void test(){
            System.out.println("LHQ");
        }
        public static void test1(){
            System.out.println("LHQ");
        }
    }
}
