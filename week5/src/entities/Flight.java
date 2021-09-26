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

    public String getFrom(){ 
        return this.from ; 
    }

    public String getTo(){ 
        return this.to ; 
    }

    public int getDuration(){ 
        return this.duration ; 
    }

    public int getNumTransfer(){ 
        return this.transfers;  
    } 

    public String toString() { 
        return "\n"+this.flightNum+"\n"+this.from+"\n"+this.to+"\n" + this.duration + "\n" + this.transfers+"\n"; 
    }
}
