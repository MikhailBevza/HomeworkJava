package org.example.homework3.cw3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Books> books = getBooks();
        List<String> booksTitle = booksTitle(books);
        System.out.println(booksTitle);

    }

    public static List<Books> getBooks(){
        List<Books> books = new ArrayList<>();
        books.add(new Books("Книга 1", "Фамилия1", 2330.29, 2010, 173));
        books.add(new Books("Книга 2", "Фамилия2", 1450.2, 2007, 1500));
        books.add(new Books("Книга 3", "АФамилия3", 1670.2, 2010, 109));
        books.add(new Books("Книга 4", "Фамилия4", 1120.2, 2009, 1230));
        books.add(new Books("Книга 5", "Фамилия5", 900.35, 2011, 900));
        books.add(new Books("Книга 6", "АФамилия6", 600.21, 2012, 139));
        books.add(new Books("Книга 7", "АФамилия7", 800.21, 2015, 199));
        books.add(new Books("Книга 8", "Фамилия8", 3450.21, 2006, 3990));
        return books;
    }

    /**
     *
     * @param books - список книг
     * @return - список названий книг с необходимыми критериями
     */
    public static List<String> booksTitle(List<Books> books){
        Integer minYearsOfPublic = 2010;
        List<String> booksTitle = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (primeNums(books.get(i).numberOfPages)){
                if (books.get(i).lastname.contains("А") && books.get(i).yearOfPublishing >= minYearsOfPublic){
                    booksTitle.add(books.get(i).title);
                }
            }
        }

        return booksTitle;
    }

    /**
     *
     * @param a - проверяемое число
     * @return - является ли число простым
     */
    public static Boolean primeNums(Integer a){
        if(a < 2){
            return false;
        }
        Double rootOfNum = Math.sqrt(a);
        for (int j = 2; j <= rootOfNum; j++) {
            if (a % j == 0) {
                return false;
            }
        }
        return true;
    }
}
