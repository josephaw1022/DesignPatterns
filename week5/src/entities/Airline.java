package entities;
import java.util.ArrayList; 
import java.util.Arrays; 

public class Airline {
    

    String title ; 
    Flight[] flights; 
    int size ; 

    public Airline(String title){  
        this.title = title ; 
        this.size = 0 ;
        this.flights = new Flight[0] ; 
    }

    private Flight[] growArray(ArrayList<Flight> flights) { 
        
        Flight[] back2Array = new Flight[flights.size()]; 
        back2Array  = flights.toArray(back2Array); 
        return back2Array; 
    }

    public void addFlight(String flightNum, String from , String to, int duration ,int transfers ){ 
        Flight tempFlightObject = new Flight(flightNum , from , to , duration, transfers) ; 
        ArrayList<Flight> flightList2ArrayList = new ArrayList<Flight>(Arrays.asList(this.flights)) ; 
        flightList2ArrayList.add(tempFlightObject) ;
        this.flights = this.growArray(flightList2ArrayList); 
    }

    public String getTitle(){ 
        return this.title ; 
    }

    public FlightIterator createIterator(){
        FlightIterator tempObject = new FlightIterator(this.flights); 
        return tempObject ; 
    }  

} 
