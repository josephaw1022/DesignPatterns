package entities;

import java.util.*;

public class Eyes extends Character {
    Character character;

    public void customize() {
        this.sections.set(4, "|  o   o  |");
    }

    public Eyes(Character character) {
        this.character = character;
        // Get the iterator
        Iterator<String> it = character.sections.iterator();
        while (it.hasNext()) {
            this.sections.add(it.next());
        }
        // for (String section : character.sections) {
        // this.character.sections.add(section);
        // }
        this.customize();
    }

}
