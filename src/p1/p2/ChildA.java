package p1.p2;

import overriding.Parent;

public class ChildA extends ParentA {


    int a=90;

    void f1(){
        int a=555;
        System.out.println(a); // current method local variable
        System.out.println(this.a); // refers to current class attribute
        System.out.println(super.a); // access super class attribute
    }

    public static void main(String[] args) {
        ChildA childA = new ChildA();
        childA.f1();
    }

}
