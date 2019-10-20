package project0.ratingdataservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project0.ratingdataservice.models.Ratings;
import project0.ratingdataservice.models.UserRating;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Ratings getAllRatings(@PathVariable("movieId") String movieId)
    {
        return (new Ratings(movieId,4));
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId)
    {
        List <Ratings>ratings = Arrays.asList(
                new Ratings("123",3),
                new Ratings("345",4)
        );

        UserRating userRating =new UserRating();
        userRating.setUserRatings(ratings);
        return userRating;

    }
}
