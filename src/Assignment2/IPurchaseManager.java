package Assignment2;

public interface IPurchaseManager {
    
    float sumOfMonth(int year, int month);
    /* Calculate the sum of all purchases for a month.
    @param year
    @param month
    */
    float [] monthlyAverage(int year);
    /*For a specified year, calculate each months average purchases. 
    @param year
    @return Array of averages per month.
     */
    float [] yearlyAveragePerCategory(int year);
    /* For a specified year, calculate each category's average purchases. 
        @param year
        @return Array of averages per category.
     */
}

