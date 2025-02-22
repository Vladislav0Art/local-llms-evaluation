package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testParseNameNull() {
        // Test that parseName returns null when given a null input
        assertNull(AppVersion.parseName(null));
    }

    @Test
    public void testParseName() {
        // Test that parseName correctly parses an appversion string
        String appversion = "subscriberha-1.0.0-586499.h150";
        AppVersion parsedAppversion = AppVersion.parseName(appversion);
        assertNotNull(parsedAppversion);
        assertEquals("subscriberha", parsedAppversion.getPackageName());
        assertEquals("1.0.0", parsedAppversion.getVersion());
        assertEquals("h150", parsedAppversion.getBuildNumber());
        assertEquals("586499", parsedAppversion.getCommit());
    }

}