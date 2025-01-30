package com.netflix.frigga.ami;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameValidFormatTest() {
        String validName = "subscriberha-1.0.0-h586499";
        AppVersion appVersion = AppVersion.parseName(validName);

        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("586499", appVersion.getBuildNumber());
    }

    @Test
    public void parseNameInvalidFormatTest() {
        String invalidName = "invalid_format";
        assertNull(AppVersion.parseName(invalidName));
    }

    @Test
    public void parseNameWithNullTest() {
        assertNull(AppVersion.parseName(null));
    }

    @Test
    public void nullSafeStringComparatorTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499");

        assertEquals(0, appVersion.compareTo(appVersion));
        assertEquals(-1, appVersion.compareTo(null));
    }

    @Test
    public void getAppVersionPatternTest() {
        assertNotNull(AppVersion.getAppVersionPattern());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499");
        assertEquals("AppVersion [packageName=subscriberha, version=1.0.0, " +
                "buildJobName=null, buildNumber=586499, changelist=null]", appVersion.toString());
    }

    @Test
    public void equalsAndHashCodeTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586499");

        assertTrue(appVersion1.equals(appVersion2));
        assertEquals(appVersion1.hashCode(), appVersion2.hashCode());
    }

    @Test
    public void compareToDifferentsObjectsTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586500");

        // AppVersion1 build number is less than AppVersion2, so compareTo should return a negative value
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

    @Test
    public void compareToSameObjectsTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499");

        // If the object is being compared to itself, compareTo should return 0
        assertEquals(0, appVersion.compareTo(appVersion));
    }

}