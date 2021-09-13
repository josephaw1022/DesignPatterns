package entities;

import java.util.*;

public class Eyes extends Character {
    Character character;

    // add eyes
    public void customize() {
        this.sections.set(4, "|  o   o  |");
    }

    // constructork
    public Eyes(Character character) {
        this.character = character;
        // Get the iterator
        Iterator<String> it = character.sections.iterator();
        while (it.hasNext()) {
            this.sections.add(it.next());
        }

        this.customize();
    }

}
