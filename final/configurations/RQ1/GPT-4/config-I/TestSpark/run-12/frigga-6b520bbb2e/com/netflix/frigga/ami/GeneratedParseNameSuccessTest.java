package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameSuccessTest {

    @Test
    public void parseNameSuccessTest() {
        String amiName = "testApp-1.0.0-h123/A-Test-App/123";
        AppVersion appVersion = AppVersion.parseName(amiName);

        assertNotNull(appVersion);
        assertEquals("testApp", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("A-Test-App", appVersion.getBuildJobName());
        assertEquals("123", appVersion.getBuildNumber());
    }

}