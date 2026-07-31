package javaBasic.class1.ex;

import java.util.ArrayList;
import java.util.List;

public class MoviewReviewMain2 {
    public static void main(String[] args) {

        List<MovieReview> movieReviewList = new ArrayList<>();

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        inception.title = "어바웃 타임";
        inception.review = "인생 시간 영화";

        movieReviewList.add(inception);
        movieReviewList.add(aboutTime);

        for(MovieReview movieReview : movieReviewList){
            System.out.println(movieReview.title + " : " + movieReview.review);

        }
    }
}
