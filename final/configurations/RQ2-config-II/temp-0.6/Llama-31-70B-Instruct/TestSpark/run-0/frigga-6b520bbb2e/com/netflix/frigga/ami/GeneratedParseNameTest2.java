package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedParseNameTest2 {

    @Test
    public void parseNameTest2() {
        // Test 2: Invalid input
        String name = "invalid-appversion-string";
        AppVersion appVersion = AppVersion.parseName(name);

        assertNull(appVersion);
    }

}