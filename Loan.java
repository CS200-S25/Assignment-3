public class Loan {
    private Book book;
    private Member member;
    private boolean isActive;
    
    public Loan(Book b, Member m){
        this.book = b;
        this.member = m;
        this.isActive = true;
    }
    
    public Book getBook(){
        return book;
    }
    
    public Member getMember(){
        return member;
    }
    
    public boolean getStatus() { 
        return isActive;
    }
    
    public void deactivate() { 
        this.isActive = false;
    }
    
    @Override
    public String toString(){
        return isActive + " | Book: "+book.getTitle()+" | Member: "+member.getName()+"\n";
    }
    
}