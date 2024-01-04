package org.mockito.test_doubles.fake;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class FakeTest {


    @Test
    public void testFake(){
        BookRepository fakeBookRepository = new FakeBookRepository();
        BookService bookService = new BookService(fakeBookRepository);

        bookService.addBook(new Book("1","Mockito in 3 minutes", LocalDate.now(), 5050));
        bookService.addBook(new Book("2","Maven Easy", LocalDate.now(), 8520));
        bookService.addBook(new Book("10","Java 8 - 21", LocalDate.now(), 500));

        assertEquals(3, bookService.findNumberOfBooks());
    }

    @Test
    public void testFakeWithMockito(){
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        Book book1 = new Book("1","Mockito in 3 minutes", LocalDate.now(), 5050);
        Book book2 = new Book("2","Maven Easy", LocalDate.now(), 8520);
        Book book3 = new Book("10","Java 8 - 21", LocalDate.now(), 500);

        Collection<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        when(bookRepository.findAll()).thenReturn(bookList);

        assertEquals(3, bookService.findNumberOfBooks());
    }
}
