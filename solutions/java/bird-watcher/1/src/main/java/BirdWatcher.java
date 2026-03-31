/**
 * The BirdWatcher class contains several methods to assist a bird watcher
 * in tracking statistics regarding the results of their bird watching
 * activities.
 *
 * Data stored in arrays in order of days. For example, birds seen on day 1
 * of the week is stored at birdsPerDay[0].
 */
class BirdWatcher {
    private final int[] birdsPerDay;

    /**
     * Creates a usable copy of birdsPerDay.
     * 
     * @param birdsPerDay  an array of integers, each representing the number
     *                     of birds seen on each day of the current week
     */
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    /**
     * Returns the data for the previous week.
     */
    public int[] getLastWeek() {
        int[] birdsLastWeek = {0, 2, 5, 3, 7, 8, 4};
        return birdsLastWeek;
    }

    /**
     * Returns the number of birds seen on the current day.
     */
    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    /**
     * Adds 1 to the number of birds seen on the current day.
     */
    public void incrementTodaysCount() {
        int today = getToday() + 1;
        birdsPerDay[birdsPerDay.length - 1] = today;
    }

    /**
     * Checks if there was a day with zero birds seen.
     *
     * @return true if there was a day with 0 birds,
     *         false if there was no day with 0 birds
     */
    public boolean hasDayWithoutBirds() {
        boolean found = false;
        for (int count: birdsPerDay) {
            if (count == 0) {
                found = true;
            }
        }
        return found;
    }

    /**
     * Provides the sum of the number of birds up to a given day
     * in the current week, from day 1 through defined day.
     *
     * @param numberOfDays  the number of days to include
     * @return the sum of the birds seen on the defined days
     */
    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        
        for (int i = 0; i < limit; i++) {
            count += birdsPerDay[i];
        }
        return count;
    }

    /**
     * Returns the number of days with 5 or more birds seen.
     */
    public int getBusyDays() {
        int count = 0;

        for (int birds: birdsPerDay) {
            if (birds >= 5) {
                count++;
            }
        }
        return count;
    }
}
