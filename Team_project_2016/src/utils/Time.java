package utils;

/**
 * Created by oxana_bs on 11.4.2016 г..
 */

public class Time {

    public static final long	SECOND	= 1000000000l;

    public static long get() {
        return System.nanoTime();
    }

}
