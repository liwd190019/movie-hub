package wendali.movies;

import org.bson.types.ObjectId;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
  @Id
  private ObjectId id;
  private String imdbId;
  private String title;
  private String releaseData;
  private String trailerLink;
  private String poster;
  private List<String> genres;
  private List<String> backdrops;
  // let the database only store the ids of the review
  // and the review will be stored in separate collection
  @DocumentReference
  private List<Review> reviewIds;
}
