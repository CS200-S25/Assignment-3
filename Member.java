import java.util.ArrayList;

public class Member {
    private String name;
    private String contactInfo;
    private ArrayList<Loan> borrowingHistory;
    
    public Member(String name, String contact){
        this.name = name;
        this.contactInfo = contact;
        borrowingHistory = new ArrayList<Loan>();
    }
    
    public String getName(){
        return name;
    }
    
    public void borrow(Loan loan){
        borrowingHistory.add(loan);
    }
    
    @Override
    public String toString(){
        String s = "Name: "+ name + " | Contact: " + contactInfo + "\n";
        s += "Borrowing history for member:\n\n";
        for(int i = 0; i < borrowingHistory.size(); i++){
            Loan l = borrowingHistory.get(i);
            Book borrowedBook = l.getBook();
            s += borrowedBook.toString() + "    Currently borrowed: "+ l.getStatus()+"\n\n";
        }
        return s;
    }
}