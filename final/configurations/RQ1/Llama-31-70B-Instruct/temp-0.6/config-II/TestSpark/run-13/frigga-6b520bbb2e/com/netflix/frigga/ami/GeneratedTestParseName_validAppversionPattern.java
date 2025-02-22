package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GeneratedTestParseName_validAppversionPattern {

    @Test
    public void testParseName_validAppversionPattern() {
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion parsedName = AppVersion.parseName(amiName);

        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertEquals("WE-WAPP-subscriberha", parsedName.getBuildJobName());
        assertEquals("150", parsedName.getBuildNumber());
        assertEquals("586499.h150", parsedName.getCommit());
    }

}