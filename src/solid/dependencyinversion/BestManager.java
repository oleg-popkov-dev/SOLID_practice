package solid.dependencyinversion;

public class BestManager implements IManager{


    @Override
    public void speak(IDeveloper developer) {
        System.out.println("Manager speak with developer");
        developer.writeCode();
    }
}