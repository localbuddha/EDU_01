package edu08.Test;

public class Class1 implements Interface1 {
    public static void main(String[] args) {
        //Class1 c3 = new Interface1();
//Class1 c4 = new Class3();
        Interface1 i2 = new Class2();
        Class1 c1 = new Class2();
        Class2 c5 = (Class2) new Class2();
//Interface1 i3 = new Class4();
//Class2 c2 = new Class3();
        Interface1 i1 = new Class1();
    }
}

class Class2 extends Class1 implements Interface1 {
}

class Class3 implements Interface1 {
}

class Class4 {
}

interface Interface1 {
}

