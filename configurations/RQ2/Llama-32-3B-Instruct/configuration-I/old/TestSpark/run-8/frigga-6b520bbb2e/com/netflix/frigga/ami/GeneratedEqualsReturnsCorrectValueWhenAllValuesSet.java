package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedEqualsReturnsCorrectValueWhenAllValuesSet {

    @Test
    public void equalsReturnsCorrectValueWhenAllValuesSet() {
        String amiName = "1.0-1";
        AppVersion appVersion = new AppVersion(amiName);
        assertEquals(appVersion, new AppVersion(amiName));
    }
}

public class AppVersion {

    private static final Pattern pattern = Pattern.compile("^\\d+\\.\\d+$");

    public static String parseName(String name) {
        // Implementation
    }

    public int compareTo(AppVersion other) {
        // Implementation
    }

    public static Pattern getAppVersionPattern() {
        return pattern;
    }

}