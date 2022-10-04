public class Main {
    public static void main(String[] args) {
        final G g1 = new G();
        final G g2 = new H();
        final G g3 = new I();

        System.out.println("1");
        g1.foo();
        System.out.println("2");
        g2.foo();
        System.out.println("3");
        g3.foo();
    }


}

class G
{
    public void foo()
    {
        System.out.println("G:: foo");
        bar();
    }

    public void bar()
    {
        System.out.println("G:: bar");
    }

    public void car()
    {
        System.out.println("G::car");
    }

}

class H extends G
{
    public void bar()
    {
        System.out.println("H::bar");
        car();

    }

    public void car()
    {
        System.out.println("H::car");
    }


}

class I extends H
{
    public void foo()
    {
        System.out.println("I::foo");
        super.foo();
    }
    public void bar()
    {
        System.out.println("I::bar");
        super.bar();
    }
    public void car()
    {
        System.out.println("I::car");
        super.car();
    }


}
