package org.mockito.test_doubles.fake;

public class BookService {

    /*Se crea una objeto test-double para la simular la dependencia externa del repositorio, que
    conecta con la base de datos.*/
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }

    public int findNumberOfBooks(){
        return bookRepository.findAll().size();
    }

}
