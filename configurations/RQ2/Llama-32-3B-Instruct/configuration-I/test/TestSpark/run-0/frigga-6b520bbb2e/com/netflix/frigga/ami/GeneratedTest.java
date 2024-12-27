package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.io.IOException;
import java.util.Collections;

public class GeneratedTest {

    private String appName;
    private int version;

    public AppVersion(String appName, int version) {
        this.appName = appName;
        this.version = version;
    }

    public static List<String> getChangelist() {
        return Arrays.asList("changelog1", "changelog2");
    }
}

public class TestAppVersion {

    @Test
    public void parseName_EmptyString_ReturnsNull() {
        assertNull(AppVersion.parseName(""));
    }

    @Test
    public void parseName_NoHyphen_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> AppVersion.parseName("123456"));
    }

    @Test
    public void parseName_ValidFormat_ReturnsParsedAppVersion() {
        String amiName = "my-app-1.2.3";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNotNull(parsedAppVersion);
        assertEquals(amiName, parsedAppVersion.toString());
        assertEquals("my-app", parsedAppVersion.getPackageName());
        assertEquals("1.2.3", parsedAppVersion.getVersion());
    }

    @Test
    public void parseName_MissingHyphen_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> AppVersion.parseName("1234567890"));
    }

    @Test
    public void getAppVersionPattern_ReturnsPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
        assertTrue(pattern.matcher("my-app-1.2.3").matches());
    }

}