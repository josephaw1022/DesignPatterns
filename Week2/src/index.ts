import BestSellers from "./Entities/BestSellers";
import Customer from "./Entities/Customer";
import Book from "./Entities/Book";
import Store from "./Entities/Store";


// const BestSellers = require('./Entities/BestSellers')
// const Book = require('./Entities/Book')
// const Store = require('./Entities/Store')
// const Customer = require('./Entities/Customer');

// Setting classes 

const bestSellers = new BestSellers;
const myStore = new Store(bestSellers.bestSellers)
const myCustomer = new Customer(bestSellers.bestSellers, "Amy", "Smith");

// Book Classes 
const book1 = new Book("The Bust", "Ashely", "Audrain");
const book2 = new Book("A Crooked Tree", "Una", "Mannion")
const book3 = new Book("Let Me Tell You What I Mean", "Joan", "Didion")
const book4 = new Book("The Wife Upstairs", "Racheal", "Hawkins")
const book5 = new Book("Summerwater", "Sarah", "Moss")
const book6 = new Book("Life Among the Terranauts", "Caitlin", "Horrocks");
const book7 = new Book("The Removed", "Brandon", "Hobson");
const book8 = new Book("Girl A", "Abigail", "Dean")
const book9 = new Book("The Kindest Lie", "Nancy", "Johnson")
const book10 = new Book("My Year Abroad", "Chang", "Rae-Lee")

// Book list of books 
const bookList = [
  book1,
  book2,
  book3,
  book4,
  book5,
  book6,
  book7,
  book8,
  book9,
  book10,
]




const BookDriver = (): void => {
  const run = (): void => {
    // calling the bestSellers's addBook method 
    bookList.map(eachBook => {
      bestSellers.addBook(eachBook)
    })

    // Display the values for myStore and myCustomer 
    myStore.display()
    myCustomer.display()
  }
  return run();
}


// run the script 
BookDriver();