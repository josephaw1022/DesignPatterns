

export class Book {

    title: String;
    authorFirstName: String;
    authorLastName: String;
    
    // Initializing Book's attributes 
    constructor(title: String, authorFirstName: String, authorLastName: String) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }
    
 
    // Returns Title  (Making a comment for this is a bit overkill)
    public get getTitle(): String {
        return this.title;
    }

    // Returns author first name 
    public get getAuthorFirstName(): String {
        return this.authorFirstName;
    }

    // Returns authors last name  
    public get getAuthorLastName(): String {
        return this.authorLastName;
    }; 

    // if toString's input value is null or undefined, then tell them that there exist no methods on that object type 
    private errorMessage(): void {
        console.log('Error. Objects with type void || null do not contain the method ');
    };

    // converts to string 
    public toString(someValue: any): String | void {
        return someValue === undefined || someValue === null ? this.errorMessage() : someValue.toString();
    }
} ;  

export default Book ; 
