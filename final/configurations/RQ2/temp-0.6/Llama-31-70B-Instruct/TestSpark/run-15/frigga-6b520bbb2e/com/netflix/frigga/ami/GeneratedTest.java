package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    private AppVersion appVersion;

    @Before
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testGetAppVersionPattern() {
        Pattern pattern = appVersion.getAppVersionPattern();
        assertEquals("([" + NameConstants.NAME_HYPHEN_CHARS
                + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?", pattern.pattern());
    }

    @Test
    public void testParseName_null() {
        assertNull(AppVersion.parseName(null));
    }

    @Test
    public void testParseName_invalid() {
        assertNull(AppVersion.parseName("invalid"));
    }

    @Test
    public void testParseName_valid() {
        String name = "subscriberha-1.0.0-586499.h150";
        AppVersion parsedName = AppVersion.parseName(name);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertEquals("586499", parsedName.getBuildNumber());
        assertEquals("h150", parsedName.getCommit());
    }

    @Test
    public void testCompareTo_null() {
        assertEquals(1, appVersion.compareTo(null));
    }

}