package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    public static AppVersion parseName(String amiName) { /* implementation */ }

    public int compareTo(AppVersion other) { /* implementation */ }

    public static Pattern getAppVersionPattern() { /* implementation */ }

    private AppVersion() {
    }

    public static AppVersion createAppVersion(String version, String build) {
        return new AppVersion(version, build);
    }
}

public class AppVersionTest {

    @Test
    public void parseName_DoesNotMatchPattern_ReturnsNull() {
        String amiName = "invalid name";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNull(parsed);
    }

}