public class Main {
    public static void main(String[] args) {
        C c1 = new D();
        C c2 = new E();
        C c3 = new F();
        AbstractC ac1 = new D();
        AbstractC ac2 = new E();
        AbstractC ac3 = new F();
        D d1 = new D();
        D d2 = new E();
        E e = new E();
        F f = new F();
        
        System.out.println("1)");
        c1.foo();
        System.out.println("2)");
        c2.foo();
        System.out.println("3)");
        c3.foo();
        System.out.println("4)");
        ac1.foo();
        System.out.println("5)");
        ac2.foo();
        System.out.println("6)");
        ac3.foo();
        System.out.println("7)");
        d1.foo();
        System.out.println("8)");
        d2.foo();
        System.out.println("9)");
        e.foo();
        System.out.println("10)");
        f.foo();
    }
}

interface C{
    void foo();
}

abstract class AbstractC implements C {
    @Override
    public void foo() {
        System.out.println("AbstractI::foo");
        bar();
    }
    
    public void bar(){
        System.out.println("AbstractI::bar");
    }
}

class D extends AbstractC {
    @Override
    public void bar() {
        System.out.println("D::bar");
    }
}

class E extends D {
    @Override 
    public void bar() {
        System.out.println("E::bar");
    }
}

class F extends AbstractC {
    @Override
    public void bar() {
        System.out.println("F::bar");
    }
}
