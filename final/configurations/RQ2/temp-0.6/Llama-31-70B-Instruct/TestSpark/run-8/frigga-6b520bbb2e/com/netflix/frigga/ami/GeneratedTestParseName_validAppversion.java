package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class GeneratedTestParseName_validAppversion {

    @Test
    public void testParseName_validAppversion() {
        String appversion = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion parsedAppversion = AppVersion.parseName(appversion);
        assertNotNull(parsedAppversion);
        assertEquals("subscriberha", parsedAppversion.getPackageName());
        assertEquals("1.0.0", parsedAppversion.getVersion());
        assertEquals("586499", parsedAppversion.getBuildNumber());
        assertEquals("h150", parsedAppversion.getCommit());
        assertEquals("WE-WAPP-subscriberha", parsedAppversion.getBuildJobName());
    }

}