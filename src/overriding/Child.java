package overriding;

public class Child extends Parent {

    public void m2(){
        System.out.println("Child class m2() method");
    }

    protected Character m1(){
       return 'a';
    }

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.m1());
        c.m2();

    }

}
