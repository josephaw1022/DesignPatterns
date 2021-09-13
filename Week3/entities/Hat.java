package entities;

import java.util.*;

public class Hat extends Character {
    Character character;

    public void customize() {
        this.sections.set(0, "______");
        this.sections.set(1, "|      | ");
    }

    public Hat(Character character) {
        this.character = character;
        // for (String section : character.sections) {
        // this.character.sections.add(section);
        // }
        Iterator<String> it = character.sections.iterator();
        while (it.hasNext()) {
            this.sections.add(it.next());
        }
        ;
        this.customize();

    }

}
