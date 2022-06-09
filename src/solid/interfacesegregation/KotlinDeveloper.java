package solid.interfacesegregation;

public class KotlinDeveloper implements IDeveloper, ITester {


    @Override
    public void writeCode() {
        System.out.println("kotlin code");
    }

    @Override
    public void eat() {
        System.out.println("kotlin eat");
    }

    @Override
    public void stressTest() {

    }

    @Override
    public void funcTest() {

    }
}
