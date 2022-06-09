package solid.liskov;

public class JSDeveloper extends Developer {

    @Override
    public void writeCode() {
        System.out.println("use js syntax");
    }

    @Override
    public void reaction() {
        System.out.println("not bad");
    }
}
