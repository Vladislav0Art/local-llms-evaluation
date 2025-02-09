package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedTest {

    @Test
    public void parseNameValidFormatTest() {
        String amiName = "testpackage-testversion-h0test.build";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("testpackage", appVersion.getPackageName());
        assertEquals("testversion", appVersion.getVersion());
        assertEquals("test.build", appVersion.getBuildJobName());
    }

    @Test
    public void parseNameInvalidFormatTest() {
        String amiName = "invalid";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals(null, appVersion);
    }

    @Test
    public void compareToEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("testpackage-testversion-h0test.build");
        AppVersion appVersion2 = AppVersion.parseName("testpackage-testversion-h0test.build");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareToDifferentTest() {
        AppVersion appVersion1 = AppVersion.parseName("testpackage1-testversion-h0test.build");
        AppVersion appVersion2 = AppVersion.parseName("testpackage2-testversion-h0test.build");
        assertNotEquals(0, appVersion1.compareTo(appVersion2));
    }

}