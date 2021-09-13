package entities;

import java.util.*;

public class Mouth extends Character {
    Character character;

    // add mouth
    public void customize() {
        this.sections.set(6, "\\   ---   /");
    }

    // constructor
    public Mouth(Character character) {
        this.character = character;
        Iterator<String> it = character.sections.iterator();
        while (it.hasNext()) {
            this.sections.add(it.next());
        }
        ;
        this.customize();
    }

}
