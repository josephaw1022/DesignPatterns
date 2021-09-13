package entities;
import entities.Character; 
import java.util.Iterator;

interface Customize { 
    public void customize() ; 
}

public abstract class CharacterDecorator implements Customize {
    Character character ; 

    public void customize(){ 
        
    }

    CharacterDecorator(Character character){
        this.character = character ; 
        Iterator<String> iter = character.sections.iterator() ; 
        while(iter.hasNext()){ 
            this.character.sections.add(iter.next()) ; 
        }; 
        this.customize();
        
        
    }





}
