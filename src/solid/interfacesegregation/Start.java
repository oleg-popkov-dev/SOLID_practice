package solid.interfacesegregation;

import solid.liskov.Developer;

import java.util.List;

public class Start {

    public static void main(String[] args) {



    }

    public static void showReaction(List <Developer> devList) {
        for (Developer dev : devList) {
            dev.reaction();
        }
    }
}
