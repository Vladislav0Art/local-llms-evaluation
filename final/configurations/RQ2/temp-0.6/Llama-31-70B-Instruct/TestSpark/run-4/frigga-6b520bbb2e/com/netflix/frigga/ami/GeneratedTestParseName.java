package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GeneratedTestParseName {

    @Test
    public void testParseName() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertEquals("586499", parsedName.getBuildNumber());
        assertEquals(null, parsedName.getCommit());
    }

}