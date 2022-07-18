package q7;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("자바", 25000));
        bookList.add(new Book("파이썬", 15000));
        bookList.add(new Book("안드로이드", 30000));

        int total = bookList.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println("모든 책의 합 : " + total);

        System.out.println("== 책의 가격이 20,000원 이상인 책의 이름을 정렬하여 출력");
        bookList.stream().filter(c -> c.getPrice() >= 20000).map(s -> s.getName()).sorted().forEach(p -> System.out.println(p));

    }
}
