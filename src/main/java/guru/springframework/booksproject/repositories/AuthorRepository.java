package guru.springframework.booksproject.repositories;

import guru.springframework.booksproject.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
