import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {

    private static List<String> separateTimeUnits(int seconds) {
        List<String> humanFriendlyStringParts = new ArrayList<>();

        for (TimeUnits unit : TimeUnits.values()) {
            int unitLength = seconds % unit.getTimeUnitLength();

            if (unitLength != 0){
                String stringPart = unitLength + " " +unit.getTimeUnitName();

                if (unitLength > 1) {
                    stringPart += ("s");
                }

                humanFriendlyStringParts.add(stringPart);
            }

            seconds /= unit.getTimeUnitLength();
        }

        return humanFriendlyStringParts;
    }

    private static String buildHumanFriendlyString(List<String> humanFriendlyStringParts) {
        StringBuilder humanFriendlyString = new StringBuilder();


        for (int i = humanFriendlyStringParts.size() - 1; i >= 0; i--) {
            humanFriendlyString.append(humanFriendlyStringParts.get(i));

            if (i != 0) {
                if (i == 1) humanFriendlyString.append(" and ");
                else humanFriendlyString.append(", ");
            }
        }

        return humanFriendlyString.toString();
    }


    public static String formatDuration(int seconds) {
        if (seconds == 0) return "now";

        return buildHumanFriendlyString(separateTimeUnits(seconds));
    }
}
