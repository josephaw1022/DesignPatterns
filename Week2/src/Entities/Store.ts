import { Subject } from "../Interfaces/Subject"
import { Book } from "./Book";

export class Store {
    subject: Subject;
    title: String;
    bestSellers: Array<Book>

    // Set Initial Values 
    constructor(bestSellers: Array<Book>) {
        this.bestSellers = bestSellers;
    }; 

    // Appends bestsellers list 
    public update(book: Book): void {
        this.bestSellers.push(book)
    };

    // Iterating through the bestSelling books and console logging each value 
    public display(): void {
        this.bestSellers.length > 0 && this.bestSellers.map(eachBook => {
            console.log(`${eachBook.title} : ${eachBook.authorFirstName} ${eachBook.authorLastName}`);
        })
        console.log('\n\n')
    };


};

export default Store; 