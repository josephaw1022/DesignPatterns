package entities;

public class PotatoeHead extends Character {

    public PotatoeHead() {
        // hat
        this.sections.add("  ");
        this.sections.add(" ") ; 
        this.sections.add("    _____");
        this.sections.add("  /        \\");
        // eyes
        this.sections.add(" |          | ");
        // nose
        this.sections.add(" |          | ");
        // mouth
        this.sections.add(" \\          /");
        this.sections.add("  \\________/  ");

    }

}
