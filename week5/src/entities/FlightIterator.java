package entities;
import java.util.Arrays; 
import java.util.ArrayList; 


public class FlightIterator implements Iterator {
    Flight[] flights ; 
    int position ; 

    public FlightIterator(Flight[] flights ){
        this.flights  = flights ; 
        this.position = 0 ; 
    }

    public boolean hasNext(){ 
        if(this.position == this.flights.length) { 
            return false ; 
        }
        return true ; 
    }; 

    public Flight next() { 
        Flight returningFlightObject = this.flights[this.position] ; 
        this.position++ ;
        return returningFlightObject ;  
    }
}
