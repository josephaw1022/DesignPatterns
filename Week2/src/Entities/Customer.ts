
import {Book} from "./Book" ; 
import { Subject } from '../Interfaces/Subject';

export class Customer { 

    subject:Subject ; 
    firstName:String ; 
    lastName: String ; 
    wishList:Book [] ; 

    constructor(){ 

    }; 

    public set update(newBook:Book){ 
        this.wishList.push(newBook)
    }; 

    public display():void { 
        const displayObject = Object.assign({}, { 
            subject: this.subject, 
            firstName:this.firstName, 
            lastName: this.lastName , 
            wishList: this.wishList, 
        })
        console.log('Customer = ', displayObject); 
        
    }
} ; 
