import { Observer } from "../Interfaces/Observer";
import { Book } from "./Book";

export class BestSellers {
  private observers: Observer[] = [];
  public bestSellers: Book[] = [];

  // appends bestSellers list
  addBook(book: Book) {
    this.bestSellers.push(book);
  }
}

export default BestSellers;
