package hu.unideb.inf.movieapplication.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "movies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "genre")
	private String genre;

	@Column(name = "length")
	private int length;

	public Movie(String title, String genre, int length) {
		this.title = title;
		this.genre = genre;
		this.length = length;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", genre=" + genre + ", length=" + length + "]";
	}

}
