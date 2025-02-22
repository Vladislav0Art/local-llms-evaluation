package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void testAppVersionParsing() {
        String amiName = "subscriberha-1.0.0-586499.h150";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertEquals("586499", parsedName.getBuildNumber());
    }

    @Test
    public void testAppVersionParsingWithCommit() {
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertEquals("586499", parsedName.getBuildNumber());
        assertEquals("150", parsedName.getCommit());
    }

}