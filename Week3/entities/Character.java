package entities;

import java.util.ArrayList;

public abstract class Character {

    ArrayList<String> sections;

    // create sections
    public Character() {
        this.sections = new ArrayList<String>();
    };

    // iterates elements of sections to the console
    public void draw() {

        for (String section : this.sections) {
            System.out.println(section);
        }

    };
}
