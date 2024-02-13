package com.sh.app.review.repository;

import com.sh.app.review.dto.MovieAverageReviewDto;
import com.sh.app.review.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    @Query("SELECT r.movie.title, AVG(r.reviewScore) FROM Review r GROUP BY r.movie.title")
    List<MovieAverageReviewDto> findAverageReviewScoreByMovieTitle();

    @Query("SELECT AVG(r.reviewScore) FROM Review r WHERE r.movie.id = :id")
    double getAverageRatingByMovieId(Long id);
}
