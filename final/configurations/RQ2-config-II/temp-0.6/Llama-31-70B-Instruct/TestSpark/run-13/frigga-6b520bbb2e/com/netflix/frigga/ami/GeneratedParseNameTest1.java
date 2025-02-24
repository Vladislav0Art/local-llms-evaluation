package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseNameTest1 {

    // Test Method: parseName

    @Test
    public void parseNameTest1() {
        AppVersion appVersion = AppVersion.parseName("test-name");
        assertNotNull(appVersion);
    }

}