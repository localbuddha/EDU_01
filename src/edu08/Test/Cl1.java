package edu08.Test;

public class Cl1 {
    void method() {
        System.out.println("Class 1");
    }
}

class Cl2 extends Cl1 {
    void method() {
        System.out.println("Class 2");
    }
}

class Cl3 extends Cl2 {
    void method() {
        super.method();
    }

    public static void main(String[] args) {
        Cl3 obj = new Cl3();
        obj.method();
    }
}
