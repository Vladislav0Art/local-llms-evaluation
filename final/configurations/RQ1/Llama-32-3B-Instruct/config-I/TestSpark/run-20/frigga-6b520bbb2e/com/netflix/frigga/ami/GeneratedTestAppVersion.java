package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

public class GeneratedTestAppVersion {

    private String packageName;
    private double version;

    public static AppVersion createAppVersion(String packageName, double version) {
        return new AppVersion(packageName, version);
    }

    public String getPackageName() {
        return packageName;
    }

    public double getVersion() {
        return version;
    }
}

// GeneratedTest.java
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testAppVersion() {
        AppVersion parsedAppVersion = AppVersion.createAppVersion("subscriberha", 1.0);
        assertNull(parsedAppVersion, "");
        assertEquals(1.0, parsedAppVersion.getVersion());
        assertEquals("subscriberha", parsedAppVersion.getPackageName());

        AppVersion appVersion1 = AppVersion.createAppVersion("job1", 2.0);
        AppVersion appVersion2 = AppVersion.createAppVersion("subscriberha", 1.0);

        assertNotEquals(appVersion1.compareTo(appVersion2), -1);
    }

}