package com.hcl.interviews;

/**
 * Implementation of {@link TimeConverter} interface.
 */
public class TimeConverterImpl implements TimeConverter {
    @Override
    public String convertTime(String inputTime) {
        if (!inputTime.matches("\\d\\d:\\d\\d:\\d\\d")) {
            throw new IllegalArgumentException("Time must be in the format HH:MM:SS");
        }

        StringBuilder timeSB = new StringBuilder();
        String[] timeElements = inputTime.split(":");
        Integer secondsInput = Integer.parseInt(timeElements[2]);
        Integer hourInput = Integer.parseInt(timeElements[0]);
        Integer minsInput = Integer.parseInt(timeElements[1]);
        

        timeSB.append(new Second().getLamps(secondsInput)).append("\n");
        timeSB.append(new Hour().getLamps(hourInput)).append("\n");
        timeSB.append(new Minute().getLamps(minsInput));

        return timeSB.toString();
    }
    
    public static void main(String ar[]) {
    	TimeConverter converter = new TimeConverterImpl();
    	System.out.println(converter.convertTime("13:17:02"));
	}
}
