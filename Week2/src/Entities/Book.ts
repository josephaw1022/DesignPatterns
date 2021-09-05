

export class Book {
    title: String;
    authorFirstName: String;
    authorLastName: String;

    constructor(title:String , authorFirstName:String, authorLastName:String) {
        this.title = title ;
        this.authorFirstName= authorFirstName; 
        this.authorLastName = authorLastName; 
    }

    public get getTitle(): String {
        return this.title;
    }

    public get getAuthorFirstName(): String {
        return this.authorFirstName;
    }

    public get getAuthorLastName(): String {
        return this.authorLastName;
    }

    private errorMessage(): String {
        return 'Error. Objects with type void || null do not contain the method '
    };

    public toString(someValue: any) {
        return someValue === undefined || someValue === null ? this.errorMessage() : someValue.toString() :
    }
}