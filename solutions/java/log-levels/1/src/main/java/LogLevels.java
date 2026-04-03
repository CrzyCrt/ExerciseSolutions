/**
* The LogLevels class provides methods for processing a String object.
* The String object being processed should be formatted like this:
* "[<LEVEL>]: <Message>"
*
* @author CrzyCrt
*/
public class LogLevels {

    /**
    * Returns the <Message> from the String object.
    *
    * @param logLine  the String object to process
    * @return the <Message>
    */
    public static String message(String logLine) {
        String[] logLineSplit = logLine.split(":");
        String message = logLineSplit[1].trim();
        
        return message;
    }

    /**
    * Returns the <LEVEL> from the String object, in lowercase.
    *
    * @param logLine  the String object to process
    * @return the <LEVEL>, in lowercase
    */
    public static String logLevel(String logLine) {
        String[] logLineSplit = logLine.split(":");
        String level = logLineSplit[0].toLowerCase().replace("[", "").replace("]", "");
        
        return level;
    }

    /**
    * Returns the String object, reformatted to "<Message> (level)"
    *
    * @param logLine  the String object to process
    * @return the reformatted String
    */
    public static String reformat(String logLine) {
        String message = message(logLine);
        String level = " (" + logLevel(logLine) + ")";
        String reformat = message + level;

        return reformat;
    }
}
