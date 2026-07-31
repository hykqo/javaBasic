package javaBasic.class1.ex;

public class MoviewReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        inception.title = "어바웃 타임";
        inception.review = "인생 시간 영화";

        System.out.println(inception.title + " : " + inception.review);
        System.out.println(aboutTime.title + " : " + aboutTime.review);
    }
}
