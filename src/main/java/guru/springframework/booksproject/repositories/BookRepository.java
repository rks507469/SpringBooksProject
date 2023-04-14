package guru.springframework.booksproject.repositories;

import guru.springframework.booksproject.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
