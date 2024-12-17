package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestParseName {

    public static AppVersion parseName(String amiName) {
        if (amiName == null || amiName.isEmpty()) {
            return null;
        }
        Matcher matcher = APP_VERSION_PATTERN.matcher(amiName);
        if (!matcher.matches()) {
            return null;
        }
        return new AppVersion();
    }

    @Test
    public void testParseName() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedName = parseName(amiName);
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertEquals("subscriberha-h150", parsedName.getBuildJobName());
        assertEquals("586499", parsedName.getBuildNumber());
    }

}