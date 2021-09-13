package entities;

import java.util.*;

public class Nose extends Character {
    Character character;

    public void customize() {
        this.sections.set(5, "|     >     |");
    }

    public Nose(Character character) {
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
