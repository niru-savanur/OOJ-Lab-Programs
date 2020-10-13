import java.util.Scanner;
class Book{
    private String author;
    private String name;
    private int num_pages;
    private double price;

    Scanner sc = new Scanner(System.in);

    Book(){}
    Book(String author, String name, int num_pages, double price){
        this.author = author;
        this.name = name;
        this.num_pages = num_pages;
        this.price = price;
    }

    void getDetails(){
        System.out.println("Enter author name");
        author = sc.next();
        System.out.println("Enter bookname");
        name = sc.next();
        System.out.println("Enter no of pages");
        num_pages = sc.nextInt();
        System.out.println("Enter price");
        price = sc.nextDouble();
        }


    public String toString(){
        return ("AUTHOR :"+author+"\nBOOK NAME :"+name+"\nPAGES :"+num_pages+"\nPRICE :"+price);
    }
}

class BookMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("ENTER THE NUMBER OF BOOKS");
        n = sc.nextInt();
        System.out.println("----------------------------------");
        Book b[] = new Book[n];
        b[0] = new Book("Tony", "Computers", 699, 2000.99 );
        for(int i=1;i<n;i++){
            System.out.println("ENTER DETAILS OF BOOK :"+(i+1));
            b[i] = new Book();
            b[i].getDetails();
            System.out.println("----------------------------------");
        }

        System.out.println("\n\nALL BOOK DETAILS THAT YOU ENTERED");
        System.out.println("----------------------------------");
        for(int i=0;i<n;i++){
            System.out.println("\n*********");
            System.out.println("BOOOK :"+(i+1));
            System.out.println(b[i]);
        }


    }
}