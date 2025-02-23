package com.netflix.frigga.ami;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.Test;

public class GeneratedTestParseName {

    @Test
    public void testParseName() {
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion result = AppVersion.parseName(amiName);

        assertNotNull(result);
        assertEquals("subscriberha", result.getPackageName());
        assertEquals("1.0.0", result.getVersion());
        assertEquals("WE-WAPP-subscriberha", result.getBuildJobName());
        assertEquals("150", result.getBuildNumber());
        assertEquals("h150", result.getCommit());
    }

}