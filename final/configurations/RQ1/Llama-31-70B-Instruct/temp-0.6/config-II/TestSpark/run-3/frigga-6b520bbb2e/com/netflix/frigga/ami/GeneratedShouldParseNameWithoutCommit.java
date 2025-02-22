package com.netflix.frigga.ami;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedShouldParseNameWithoutCommit {

    @Test
    public void shouldParseNameWithoutCommit() {
        String amiName = "subscriberha-1.0.0-586499.h150";
        AppVersion appVersion = AppVersion.parseName(amiName);

        assertNotNull(appVersion);
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("h150", appVersion.getBuildNumber());
        assertEquals(null, appVersion.getBuildJobName());
        assertEquals(null, appVersion.getCommit());
    }

}