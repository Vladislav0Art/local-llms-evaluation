package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void parseNameTest1() {
        // Test 1: Valid input
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(name);

        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("WE-WAPP-subscriberha", appVersion.getBuildJobName());
        assertEquals("150", appVersion.getBuildNumber());
        assertEquals("h150", appVersion.getCommit());
    }

    @Test
    public void parseNameTest2() {
        // Test 2: Invalid input
        String name = "invalid-appversion-string";
        AppVersion appVersion = AppVersion.parseName(name);

        assertNull(appVersion);
    }

    @Test
    public void parseNameTest3() {
        // Test 3: Null input
        String name = null;
        AppVersion appVersion = AppVersion.parseName(name);

        assertNull(appVersion);
    }

}