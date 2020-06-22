import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeFormatterTest {

    @Test
    public void testZero(){
        assertEquals("now", TimeFormatter.formatDuration(0));
    }

    @Test
    public void testSeconds(){
        assertEquals("1 second", TimeFormatter.formatDuration(1));
    }

    @Test
    public void testMinutes(){
        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
    }

    @Test
    public void testHours(){
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
    }

    @Test
    public void testDays(){
        assertEquals("2 days, 1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(176462));
    }

    @Test
    public void testYears(){
        assertEquals("2 years and 1 second", TimeFormatter.formatDuration(63072001));
    }
}
