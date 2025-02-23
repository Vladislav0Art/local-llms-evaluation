package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedParseNameTest1 {

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

}