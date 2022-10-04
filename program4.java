class Alphabet {
    public void display() {
        System.out.println("Alpha");
    }
}

class A extends Alphabet {
    public void display() {
        System.out.println("A");
    }
}

class B extends Alphabet {
    public void display() {
        System.out.println("B");
    }
}

class C extends Alphabet {
    public void display() {
        System.out.println("C");
    }
}

class D extends Alphabet {
    public void display() {
        System.out.println("D");
    }
}

class E extends Alphabet {
    public void display() {
        System.out.println("E");
    }
}


public class Soup {
    private Alphabet[] bowl;

    public void simmer() {
        bowl = new Alphabet[5];
        bowl[0] = new E();
        bowl[1] = new C();
        bowl[2] = new D();
        bowl[3] = new B();
        bowl[4] = new A();
        for (int i = 0; i < bowl.length; i++) {
            bowl[i].display();
        }

        System.out.println("");

        change(bowl[0], new A());
        bowl[0].display();
        System.out.println("");

        bowl[0] = new E();
        change(bowl, new A(), 0);
        bowl[0].display();

    }

    public void change(Alphabet a, Alphabet b) {
        a = b;

    }

    public void change(Alphabet[] a, Alphabet b, int index) {
        a[index] = b;
    }

    public static void main(String[] args) {
        Soup pho = new Soup();
        pho.simmer();
    }

}
