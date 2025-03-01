import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    private ArrayList<Loan> activeLoans;
    
    public Library(){
        this.books = new ArrayList<Book>();
        this.members = new ArrayList<Member>();
        this.activeLoans = new ArrayList<Loan>();
    }
    
    public void addBook(Book book) { 
        books.add(book);
    }
    
    public void registerMember(Member member) { 
        members.add(member);
    }
    
    public void checkoutBook(Book book, Member member) { 
        if(book.isAvailable()){
            Loan checkout = new Loan(book, member);
            activeLoans.add(checkout);
            member.borrow(checkout);
            book.setAvailability(false);
        }else{
            System.out.println(book.getTitle()+" is already borrowed");
        }
    }
    
    public void returnBook(Book b) { 
        
        for(int i = 0; i < activeLoans.size(); i++){    
            Loan searchLoan = activeLoans.get(i);
            Book searchBook = searchLoan.getBook();
            String bookTitle = searchBook.getTitle();
            Member searchMember = searchLoan.getMember();
            String memberName = searchMember.getName();
            
            if(bookTitle.equals(b.getTitle())){
                searchLoan.deactivate();
                activeLoans.remove(i);
                searchBook.setAvailability(true);
            }
        }
    }
    
    public void printLoans(){
         String s = "There are "+activeLoans.size()+" active loans in this library:\n";
         for(int i = 0; i < activeLoans.size(); i++){
             Loan l = activeLoans.get(i);
             s += l.toString();
         }
         System.out.println(s);
    }
    
    @Override
    public String toString(){
         String s = "This library has "+ members.size()+ " members \n\n";
         s += "Books in this library:\n";
         for(int i = 0; i < books.size(); i++){
             Book b = books.get(i);
             s += "["+i+"]"+b.toString();
         }
         return s;
    }
    
    public static void main(String[] args){
        Library myLibrary = new Library();
        
        Book b1 = new Book("The Hunger Games", "Suzanne Collins");
        Book b2 = new Book("Pride and Prejudice", "Jane Austen");
        Book b3 = new Book("The Picture of Dorian Gray", "Oscar Wilde");
        Book b4 = new Book("Jane Eyre", "Charlotte Brontë");
        
        myLibrary.addBook(b1);
        myLibrary.addBook(b2);
        myLibrary.addBook(b3);
        myLibrary.addBook(b4);
        
        Member m1 = new Member("James Wilson", "(555) 123-4567");
        Member m2 = new Member("Sophia Washington", "(555) 234-5678");
        Member m3 = new Member("Fatima Al-Zahrani", "(555) 567-8901");
        Member m4 = new Member("Gabriel Morales", "(555) 890-1234");
        Member m5 = new Member("Darius Blackwell", "(555) 901-2345");
        
        myLibrary.registerMember(m1);
        myLibrary.registerMember(m2);
        myLibrary.registerMember(m3);
        myLibrary.registerMember(m4);
        myLibrary.registerMember(m5);
        
        System.out.println(myLibrary);
        
        myLibrary.checkoutBook(b1, m1);
        myLibrary.printLoans();
        myLibrary.checkoutBook(b1, m2);
        myLibrary.printLoans();
        myLibrary.checkoutBook(b2, m2);
        myLibrary.printLoans();
        
        myLibrary.returnBook(b1);
        myLibrary.printLoans();
        
        
    }
}
