package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetCommit {

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
    public void testGetCommit() {
        AppVersion appVersion = parseName("subscriberha-1.0.0-586499");
        assertNotNull(appVersion.getCommit());
        assertEquals(" subscriberha-h150", appVersion.getCommit());
    }

}