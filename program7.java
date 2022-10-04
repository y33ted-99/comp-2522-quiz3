public class Main {
    public static void main(String[] args) {
        final I i1 = new A();
        final I i2 = new B();
        final A a = new A();
        final B b = new B();

        System.out.println("1)");
        i1.foo();
        System.out.println("2)");
        i2.foo();
        System.out.println("3)");
        a.foo();
        System.out.println("4)");
        b.foo();

    }
}

interface I {
    void foo();

}

class A implements I {
    @Override
    public void foo() {
        System.out.println("A::foo");
    }
}

class B implements I {
    @Override
    public void foo() {
        System.out.println("B::foo");
    }
}
