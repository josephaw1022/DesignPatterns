package entities;

import java.util.*;

public class Nose extends Character {
    Character character;
    // add nose 
    public void customize() {
        this.sections.set(5, "|     >     |");
    }

    // constructor
    public Nose(Character character) {
        this.character = character;
    
        Iterator<String> it = character.sections.iterator();
        while (it.hasNext()) {
            this.sections.add(it.next());
        }
        ;
        this.customize();
    }

}
