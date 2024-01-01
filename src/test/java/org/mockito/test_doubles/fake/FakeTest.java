package org.mockito.test_doubles.fake;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
