public class Task {

    /*
    # MVP:
    setTitle
    getTitle
    setDescription
    getDescritpion
    printTask
     */


    // Fields
    private String title;
    private String description;


    // Constructors
    public Task() {
        this.description = "empty";
    }

    public Task( String description) {
        this.description = description;
    }


    // Methods
    public void setTitle( String title ) {
        this.title = title;
    }

    public String getTitle() {
        System.out.println("Title: " + this.title);
        return this.title;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public String getDescription() {
        System.out.println("Description: " + description);
        return description;
    }

    public void printTask() {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
    }

}
