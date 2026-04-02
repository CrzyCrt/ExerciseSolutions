/**
* The SalaryCalculator class provides methods for determining an employee's
* salary based on their number of days skipped and number of units sold.
*
* This class demonstrates the use of ternary operators.
*/

public class SalaryCalculator {

    /**
    * Provides the salary multiplier based on the number of days skipped.
    *
    * @param daysSkipped  the number of days the employee skipped work, as int
    * @return  0.85 if daysSkipped is at least 5;
    *          1.0 if daysSkipped less than 5
    */
    public double salaryMultiplier(int daysSkipped) {
        boolean penalty = daysSkipped >= 5;
        double multiplier = penalty ? 0.85 : 1.0;
        return multiplier;
    }

    /**
    * Provides the bonus multiplier based on the number of products sold.
    *
    * @param productsSold  the number of products the employee sold, as int
    * @return  13 if productsSold is at least 20;
    *          10 if productsSold less than 20
    */
    public int bonusMultiplier(int productsSold) {
        boolean bonus = productsSold >= 20;
        int multiplier = bonus ? 13 : 10;
        return multiplier;
    }

    /*
    * Provides the bonus based on number of products sold, using
    * bonusMultiplier().
    *
    * @param productsSold  the number of products the employee sold, as int
    * @return  the bonus to be added to the employee's salary
    */
    public double bonusForProductsSold(int productsSold) {
        int multiplier = bonusMultiplier(productsSold);
        return (double) productsSold * multiplier;
    }

    /**
    * Provides the employee's final salary, based on salaryMultiplier() and
    * bonusForProductsSold(). Maximum salary 2000.00. Base salary 1000.00.
    *
    * @param daysSkipped  the number of days the employee skipped work, as int
    * @param productsSold  the number of products the employee sold, as int
    * @return  2000.0 if employee earned more than cap after bonus & multiplier;
    *          final salary if employee earned less than cap after bonus & 
    *            multiplier.
    */
    public double finalSalary(int daysSkipped, int productsSold) {
        double bonus = bonusForProductsSold(productsSold);
        double multiplier = salaryMultiplier(daysSkipped);
        double base = 1000.0;
        double salary = base * multiplier + bonus;
        boolean cap = salary >= 2000.0;
        double totalSalary = cap ? 2000.0 : salary;
        return totalSalary;
    } 
}
