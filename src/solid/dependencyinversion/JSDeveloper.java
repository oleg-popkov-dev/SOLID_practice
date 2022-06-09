package solid.dependencyinversion;

public class JSDeveloper implements IDeveloper {

    @Override
    public void writeCode() {
        System.out.println("js code");
    }

    @Override
    public void eat() {
        System.out.println("js eat");
    }
}
