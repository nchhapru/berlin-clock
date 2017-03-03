package com.hcl.interviews;

/**
 * Converts seconds to lamp.
 */

public class Second implements TimeUnit {

	/**
     * Converts seconds to indicator line.
     * It blinks every second.
     *
     * @param seconds the seconds
     * @return flashing lamp
     */

    @Override
    public String getLamps(int seconds) {
        if (seconds%2 == 0) {
            return "Y";
        }
        return "O";
    }
}