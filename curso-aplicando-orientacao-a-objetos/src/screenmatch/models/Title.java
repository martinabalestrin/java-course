package screenmatch.models;

public class Title {
    private String name;
    private int yearRelease;
    private boolean includedPlan;
    private double reviewSum;
    private int totalReviews = 0;
    private int durationMin;

    // ----------- GETTERS -----------
    public double getReviewSum() {
        return reviewSum;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public int getDurationMin() {
        return durationMin;
    }

    // ----------- SETTERS -----------
    public void setName(String name) {
        this.name = name;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public void setDurationMin(int durationMin) {
        this.durationMin = durationMin;
    }

    // ----------- METHODS -----------
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + yearRelease);
        System.out.println("Review: " + reviewAvg());
    }

    public void addReview(double rating) {
        reviewSum += rating;
        totalReviews++;
    }

    public double reviewAvg() {
        return reviewSum / totalReviews;
    }
}
