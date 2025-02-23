package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedParseNameTest3 {

    @Test
    public void parseNameTest3() {
        // Test 3: Null input
        String name = null;
        AppVersion appVersion = AppVersion.parseName(name);

        assertNull(appVersion);
    }

}