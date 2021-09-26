package entities;

public class Flight {
    String flightNum ; 
    String from ;   
    String to ; 
    int duration; 
    int transfers ;

    public Flight(String flightNum , String from , String to , int duration , int transfers){ 
        this.flightNum = flightNum; 
        this.from = from ; 
        this.to= to ; 
        this.duration = duration ; 
        this.transfers = transfers ; 
    }

    /** 
     * getter
     * @return String
     */
    public String getFrom(){ 
        return this.from ; 
    }

    
    /** 
     * getter 
     * @return String
     */
    public String getTo(){ 
        return this.to ; 
    }

    
    /** 
     * getter 
     * @return int
     */
    public int getDuration(){ 
        return this.duration ; 
    }

    
    /** 
     * getter 
     * @return int
     */
    public int getNumTransfer(){ 
        return this.transfers;  
    } 

    
    /** 
     * display Flight Object's attributes via a string 
     * @return String
     */
    public String toString() { 
        return "\n"+this.flightNum+"\n"+this.from+"\n"+this.to+"\n" + this.duration + "\n" + this.transfers+"\n"; 
    }
}
