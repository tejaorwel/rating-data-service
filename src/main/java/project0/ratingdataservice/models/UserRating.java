package project0.ratingdataservice.models;

import java.util.List;

public class UserRating {

    private List <Ratings> userRatings;

    public List<Ratings> getUserRatings() {
        return userRatings;
    }

    public void setUserRatings(List<Ratings> userRatings) {
        this.userRatings = userRatings;
    }
}

