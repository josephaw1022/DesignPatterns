
import { Book } from "./Book";
import { Subject } from '../Interfaces/Subject';


export class Customer {

    subject: Subject;
    firstName: String;
    lastName: String;
    wishList: Book[];

    // Initializing our classes attributes 
    constructor(wishList: Book[], firstName: String, lastName: String) {
        this.wishList = wishList;
        this.firstName = firstName;
        this.lastName = lastName;
    };

    // appending our wishlist array list
    public set update(newBook: Book) {
        this.wishList.push(newBook)
    };


    // iterating through each wishlist item and console logging each value 
    public display(): void {

        this.wishList.map(eachBook => {
            console.log(`${eachBook.title}: ${eachBook.authorFirstName} + ${eachBook.authorLastName}`)
        });
        console.log('\n\n')

    }
};


export default Customer;