
package llab_prob_a;

import java.util.Scanner;

class Book{
    private int ISBN;
    private String bookTitle;
    private int numberOfPages;
    static int count;
    
    Book(int ISBN, String Title, int numOfPages){
        this.ISBN= ISBN;
        this.bookTitle= Title;
        this.numberOfPages= numOfPages;
        count++;
    }
    Book(){
        this.ISBN=0;
        this.bookTitle="";
        this.numberOfPages= 0;
        count++;
    }
    public String toString(){
        String str="Book ISBN: "+ this.ISBN+"\n Book Title: "+this.bookTitle+"\n Number of Pages: "+this.numberOfPages; 
        return str;
    }

    public int compareTo(Book ob){
        if(ob.ISBN== this.ISBN && ob.bookTitle.equals(this.bookTitle) && ob.numberOfPages==this.numberOfPages){
            return 1;
        }
        else{
            return 0;
        }
        
    }
    public static int getCount(){
        return count;
    }
    public int getNumOfPages(){
         return this.numberOfPages;
    }
}
public class Llab_prob_A {

    public static void main(String[] args) {
        int ISBN, numOfPage, n;
        String title;
        Scanner in= new Scanner(System.in);
        System.out.println("How Many Books You want to input: ");
        n= in.nextInt();
        Book[] bk= new Book[n];
        for(int i=0; i<n; i++){
            System.out.println("Input Book "+(i+1)+":");
            System.out.println("Book ISBN: ");
            ISBN= in.nextInt();
            in.nextLine();
            System.out.println("Book Title: ");
            title= in.nextLine();
            System.out.println("Number of Pages: ");
            numOfPage= in.nextInt();
            bk[i]= new Book(ISBN, title, numOfPage);
        }
        System.out.println("There are "+ Book.getCount()+ " books in the system");
        System.out.println("These books are: ");
        for(int i=0; i<n; i++){
            System.out.println("Book "+(i+1)+": ");
            System.out.println(bk[i].toString());
        }
        
        System.out.println("Now Search a book: ");
        int s_isbn, s_nop;
        String s_title;
        System.out.println("Book");
        System.out.println("Book ISBN: ");
        s_isbn= in.nextInt();
        in.nextLine();
        System.out.println("Book Title: ");
        s_title= in.nextLine();
        System.out.println("Number of Pages: ");
        s_nop= in.nextInt();
        Book s_bk= new Book(s_isbn, s_title, s_nop);
        for(int i=0; i<n; i++){
            if(bk[i].compareTo(s_bk)==1){
                System.out.println("Book Found!!!");
                System.out.println("Book number: "+ (i+1));
            }
            else if(bk[i].compareTo(s_bk)==1){
                System.out.println("Book Not Found in system!!! Try Again..");
                continue;
            }
        }
    }
    
}
