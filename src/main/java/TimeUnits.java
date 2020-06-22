public enum TimeUnits {
    SECOND("second", 60),
    MINUTE("minute", 60),
    HOUR("hour", 24),
    DAY("day", 365),
    YEAR("year", Integer.MAX_VALUE);


    private final String timeUnitName;
    private final int timeUnitLength;

    public String getTimeUnitName() {
        return timeUnitName;
    }

    public int getTimeUnitLength() {
        return timeUnitLength;
    }

    TimeUnits(String timeUnitName, int timeUnitLength){
        this.timeUnitName = timeUnitName;
        this.timeUnitLength = timeUnitLength;
    }
}
