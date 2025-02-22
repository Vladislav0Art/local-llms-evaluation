package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedTestParseName_validAppversion {

    @Test
    public void testParseName_validAppversion() {
        String validAppversion = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(validAppversion);
        assertNotNull(appVersion);
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("WE-WAPP-subscriberha", appVersion.getBuildJobName());
        assertEquals("586499", appVersion.getBuildNumber());
        assertEquals("h150", appVersion.getCommit());
    }

}