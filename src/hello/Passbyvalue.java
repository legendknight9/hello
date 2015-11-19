/**
 * 
 */
package hello;

/**
 * @author ThanhNhut
 *
 */
public class Passbyvalue {
    public static void main(String[] args) {
        test t=new test();
        t.name="initialvalue";
        new Passbyvalue().changerefence(t);
        System.out.println(t.name);
    }

    public void changerefence(test f) {
//        f=null;
        f.name="changevalue";
    }
}

class test{
    String name;
}
