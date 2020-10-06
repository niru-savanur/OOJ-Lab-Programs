import java.util.Scanner;
class Book{
    private String bookid;
    private String booktitle;
    private int no_of_pages;
    private int year_of_pub;
    private String author;
    private String publisher;
    private double price;
    Scanner sc = new Scanner(System.in);
    void getDetails(){
        System.out.println("Enter book id:");
        bookid = sc.next();
        System.out.println("Enter book title:");
        booktitle = sc.next();
        System.out.println("Enter no of pages:");
        no_of_pages = sc.nextInt();
        System.out.println("Enter year of pub:");
        year_of_pub = sc.nextInt();
        System.out.println("Enter author name:");
        author = sc.next();
        System.out.println("Enter publisher name:");
        publisher = sc.next();
        System.out.println("Enter price:");
        price = sc.nextDouble();
    }

    void printDetails(){
        System.out.println("The book details are:");
        System.out.println("book id: "+ bookid);
        System.out.println("book title: "+ booktitle);
        System.out.println("no of pages: "+ no_of_pages);
        System.out.println("year of publish: "+year_of_pub);
        System.out.println("author name: "+ author);
        System.out.println("publisher: "+ publisher);
        System.out.println("price: "+ price);
    
    }
    
    String bookByAuthor(){
        return author;     
    }

    double expensive(){
        return price;
    }

    int count(){
        return year_of_pub;
    }
    int pages(){
        return no_of_pages;
    }
}

public class E_2 {
    public static void main(String[] args){
    Book b1 = new Book();
    Book b2 = new Book();
    Book b3 = new Book();
    Scanner sc = new Scanner(System.in);
    System.out.println("\n\nBook 1");
    b1.getDetails();
    System.out.println("\n\nBook 2");
    b2.getDetails();
    System.out.println("\n\nBook 3");
    b3.getDetails();
    System.out.println("\n\nBook 1");
    b1.printDetails();
    System.out.println("\n\nBook 2");
    b2.printDetails();
    System.out.println("\n\nBook 3");
    b3.printDetails();

    String auth, bk1, bk2, bk3;
    System.out.println("\n\nEnter author name to find his book:");
    auth = sc.next();
    bk1 = b1.bookByAuthor();
    if (bk1.equals(auth)){
        b1.printDetails();
    }
    bk2 = b2.bookByAuthor();
    if (bk2.equals(auth)){
        b2.printDetails();
    }
    bk3 = b3.bookByAuthor();
    if (bk3.equals(auth)){
        b3.printDetails();
    }
    
    double p1, p2, p3;
    p1 = b1.expensive();
    p2 = b2.expensive();
    p3 = b3.expensive();
    System.out.println("\n\nThe details of most expensive book are:");
    if(p1>p2){
        if(p1>p3){
           b1.printDetails(); 
        }
        else{
            b3.printDetails();
        }
    }
    else {
        if(p2>p3){
            b2.printDetails();
        }
        else{
            b3.printDetails();
        }
    }

    int count = 0,c1, c2, c3;
    c1 = b1.count();
    if(c1==2020){
        count++;
    }
    c2 = b2.count();
    if(c2==2020){
        count++;
    }
    c3 = b3.count();
    if(c3==2020){
        count++;
    }
    System.out.println("\n\nno of books published in 2020: "+ count);

    int page, pg1, pg2, pg3;
    pg1=b1.pages();
    pg2=b2.pages();
    pg3=b3.pages();
    System.out.println("\n\nbook with least pages:");
    if(pg1<pg2){
        if(pg1<pg3){
           b1.printDetails(); 
        }
        else{
            b3.printDetails();
        }
    }
    else {
        if(pg2<pg3){
            b2.printDetails();
        }
        else{
            b3.printDetails();
        }
    }
}
}