package hu.unideb.inf.movieapplication.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.unideb.inf.movieapplication.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByTitle(String title);

    List<Movie> findByTitleContaining(String title);

    Optional<Movie> findById(long id);

    List<Movie> findByGenre(String genre);

    List<Movie> findByGenreContaining(String genre);
}
