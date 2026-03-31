public class Lasagna {
    
    /* Returns the required bake time for the lasagna. 
     * 
     * @return the required bake time
     */
    public int expectedMinutesInOven() {
        return 40;
    }

    /* Returns the remaining bake time for the lasagna.
     *
     * @param elapsedMinutes the time (in minutes) the lasagna has been in oven
     * @return the remaining bake time
     */
    public int remainingMinutesInOven(int elapsedMinutes) {
        return expectedMinutesInOven() - elapsedMinutes;
    }

    /* Returns the time spent preparing the lasagna for baking.
     * Each layer requires 2 minutes preparation time.
     *
     * @param layers the number of layers prepared
     * @return the time spent preparing the lasagna
     */
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    /* Returns the total time (in minutes) spent preparing and
     *   cooking the lasagna.
     *
     * @param layers the number of layers prepared
     * @param elapsedMinutes the time the lasagna has been baking
     * @return the total time spent making the lasagna
     */
    public int totalTimeInMinutes (int layers, int elapsedMinutes) {
        return (preparationTimeInMinutes(layers)) + elapsedMinutes;
    }
}
