package solid.dependencyinversion;

public class Start {

    public static void main(String[] args) {

        IDeveloper developer1 = new JavaDeveloper();
        IDeveloper developer2 = new KotlinDeveloper();

        IManager manager = new BestManager();
        manager.speak(developer2);
    }
}
