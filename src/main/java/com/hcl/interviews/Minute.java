package com.hcl.interviews;

public class Minute implements TimeUnit {

    private static final String RED_LIGHT = "R";
    private static final String YELLOW_LIGHT = "Y";
    private static final String ALL_FOUR_LIGHTS_OFF = "OOOO";
    private static final String ALL_ELEVEN_LIGHTS_OFF = "OOOOOOOOOOO";

    /**
     * The result row is composed of 11 lights: 3 red and 8 yellow. Each light in this row stands for 5 elapsed minutes.
     * The 3 red lights have been assigned to mark the quarters of an hour and are intended to make reading the clock easier.
     * Last of all, the yellow row at the very bottom displays units of single minutes.
     *
     * @param minutes the minutes to convert
     * @return result row is composed of 11 lights
     */

    @Override
    public String getLamps(int minutes) {
        int minutesDividedBy5 = minutes / 5;
        int minutesModulus5 = minutes % 5;
        return getLampsForMinutesMultiplesOfFive(minutesDividedBy5) + "\n" + getLampsForSingleMinutes(minutesModulus5);
    }

    /**
     * Convert minutes to lamp. The 3 red lights are assigned to mark the quarters of an hour
     *
     * @param minutes the minutes to convert
     * @return corresponding lamp
     */

    
    private String getLampsForMinutesMultiplesOfFive(int minutes) {
        StringBuilder lamps = new StringBuilder(ALL_ELEVEN_LIGHTS_OFF);
        for (int i = 0; i < minutes; i++) {
            if (0 == (i + 1) % 3) {
                lamps.replace(i, i + 1, RED_LIGHT);
            } else {
                lamps.replace(i, i + 1, YELLOW_LIGHT);
            }
        }
        return lamps.toString();
    }

    private String getLampsForSingleMinutes(int minutes) {
        StringBuilder lamps = new StringBuilder(ALL_FOUR_LIGHTS_OFF);
        for (int i = 0; i < minutes; i++) {
            lamps.replace(i, i + 1, YELLOW_LIGHT);
        }
        return lamps.toString();
    }
}