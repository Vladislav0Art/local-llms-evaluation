package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidTest {

    @Test
    public void parseNameValidTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        assertNotNull(appVersion);
        assertEquals(appVersion.getPackageName(), "subscriberha");
        assertEquals(appVersion.getVersion(), "1.0.0");
        assertEquals(appVersion.getBuildNumber(), "586499");
        assertEquals(appVersion.getBuildJobName(), "WE-WAPP-subscriberha");
    }

}