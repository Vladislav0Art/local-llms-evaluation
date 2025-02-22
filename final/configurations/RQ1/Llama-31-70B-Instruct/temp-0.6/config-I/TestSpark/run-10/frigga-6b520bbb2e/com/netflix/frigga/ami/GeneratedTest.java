package com.netflix.frigga.ami;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    private static AppVersion appVersion;

    @BeforeAll
    public static void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testParseName() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion parsedName = AppVersion.parseName(name);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertEquals("WE-WAPP-subscriberha", parsedName.getBuildJobName());
        assertEquals("150", parsedName.getBuildNumber());
        assertEquals("h150", parsedName.getCommit());
    }

    @Test
    public void testNullName() {
        AppVersion parsedName = AppVersion.parseName(null);
        assertNull(parsedName);
    }

    @Test
    public void testInvalidName() {
        String name = "invalid-name";
        AppVersion parsedName = AppVersion.parseName(name);
        assertNull(parsedName);
    }

}