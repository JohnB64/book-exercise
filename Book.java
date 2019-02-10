/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (John Burkert)
 * @version (2-4-2019)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String number;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        number = "";
        courseText = bookCourseText;
    }

    // Add the methods here ...
    
    public void setRefNumber(String ref){
    
      if(number.length() > 3){
         number = ref; 
        }
        
      else {
         System.out.println("Number is less than three characters!"); 
        }
      
        
    }
    
    public void borrow() {
     borrowed += 1;   
    }
    
    
    public String getAuthor(){
    
            return author;
    }
    
    public String getTitle(){
    
            return title;
    }
    
    public int getPages(){
    
            return pages;
    }
    
    public String getRefNumber(){
    
            return number;
    
    }
    
    public int getBorrowed(){
        
        return borrowed;
    }
    
    public boolean isCourseText(){
        return courseText;
    }
    
    public void printAuthor(){
        
            System.out.println(author);
        
    }
    
    public void printTitle(){
        
            System.out.println(title);
        
    }
    
    public void printPages(){
        
            System.out.println(pages);
        
    }
    
    public void printDetails(){
        
            System.out.println("Title: " + title + ", Author: " + author+ ", Pages: " + pages + ", Number: " + number);
        
            if (number.length() > 0) {
             
                System.out.println("Number = " + number);
            }
            else{
                System.out.println("Number = ZZZ");
            }
            
            System.out.println("This book has been borrowed " + borrowed + " times.");

    }
    
    
}
