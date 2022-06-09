package solid.liskov;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {

        Developer dev1 = new JavaDeveloper();
        dev1.setLangName("Java");

        Developer dev2 = new JSDeveloper();
        dev2.setLangName("JS");

        Developer dev3 = new KotlinDeveloper();
        dev3.setLangName("Kotlin");

        List <Developer> devList = new ArrayList<>();
        devList.add(dev1);
        devList.add(dev2);
        devList.add(dev3);

//        for (Developer dev : devList) {
//            dev.writeCode();
//        }

        showReaction(devList);

    }

    public static void showReaction(List <Developer> devList) {
        for (Developer dev : devList) {
            dev.reaction();
        }
    }
}
