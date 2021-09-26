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

    
    /** 
     * whether or not the FlightIterator can iterate to another value 
     * @return boolean
     */
    public boolean hasNext(){ 
        if(this.position == this.flights.length) { 
            return false ; 
        }
        return true ; 
    }; 

    
    /**
     * gives the next value in the array 
     * @return Flight
     */
    public Flight next() { 
        Flight returningFlightObject = this.flights[this.position] ; 
        this.position++ ;
        return returningFlightObject ;  
    }
}
