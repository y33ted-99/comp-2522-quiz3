public class Main {
    public static void main(String[] args) {
        final I i1 = new A();
        final I i2 = new B();
        final AbstractI ai1 = new A();
        final AbstractI ai2 = new B();
        final A a = new A();
        final B b = new B();

        System.out.println("1)");
        i1.foo();
        System.out.println("2)");
        i2.foo();
        System.out.println("3)");
        ai1.foo();
        System.out.println("4)");
        ai2.foo();
        System.out.println("5)");
        a.foo();
        System.out.println("6)");
        b.foo();
    }
}


interface I {
    void foo();

}

abstract class AbstractI implements I {
    @Override
    public void foo() {
        System.out.println("AbstractI::foo");
    }
}

class A extends AbstractI {
    @Override
    public void foo() {
        System.out.println("A::foo");
    }
}

class B extends AbstractI {
    @Override
    public void foo() {
        System.out.println("B::foo");
    }
}
