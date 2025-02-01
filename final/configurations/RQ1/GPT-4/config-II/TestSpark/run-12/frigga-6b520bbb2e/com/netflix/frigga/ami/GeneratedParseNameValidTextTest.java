package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidTextTest {

    @Test
    public void parseNameValidTextTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        assertNotNull(appVersion);
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("586499", appVersion.getBuildNumber());
        assertEquals(null, appVersion.getCommit());
        assertEquals("WE-WAPP-subscriberha", appVersion.getBuildJobName());
    }

}