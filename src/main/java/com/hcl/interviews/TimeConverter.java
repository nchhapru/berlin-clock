package com.hcl.interviews;

public interface TimeConverter {

    /**
     * Converts time string to Berlin Clock representation.
     *
     * @param aTime the time to convert
     * @return Berlin Clock representation of the given time
     */
    String convertTime(String inputTime);
}
