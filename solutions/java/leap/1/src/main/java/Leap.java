/**
  * The Leap class defines a method that tests whether a given year is a leap year.
  * 
  * Rules to qualify:
  *   year is evenly divisble by 4 but not by 100 or year is evenly divisible by 400.
  */

class Leap {

    /**
      * Tests year divisibility and returns whether conditions for leap year are met.
      *
      * @param year the year being tested
      * @return true if given year qualifies as a leap year,
      *         false if given year dos not qualify as a leap year
      */
    boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

}
