package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedGetPackageName_AmiNameNull_ReturnsNull {

    @Test
    public void getPackageName_AmiNameNull_ReturnsNull() {
        String amiName = null;
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion, amiName);
    }
}

public class AppVersion {
    private String packageName;
    private String version;
    private String buildJobName;
    private String buildNumber;
    private String commit;

    public static AppVersion parseName(String amiName) {
        // implementation
    }

}