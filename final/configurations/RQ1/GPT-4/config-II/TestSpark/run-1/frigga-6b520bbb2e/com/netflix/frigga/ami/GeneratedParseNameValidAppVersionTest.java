package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidAppVersionTest {

    @Test
    public void parseNameValidAppVersionTest() {
        String appVersionString = "subscriberha-1.0.0-h586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(appVersionString);

        assertNotNull(appVersion);
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("WE-WAPP-subscriberha", appVersion.getBuildJobName());
        assertEquals("586499", appVersion.getBuildNumber());
        assertEquals("150", appVersion.getCommit());
    }

}