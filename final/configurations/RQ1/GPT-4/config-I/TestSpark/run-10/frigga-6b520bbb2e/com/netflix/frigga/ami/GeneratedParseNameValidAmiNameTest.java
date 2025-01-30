package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidAmiNameTest {

    @Test
    public void parseNameValidAmiNameTest() {
        String validAmiName = "test-package-0.1.0-h200/WE-WAPP-testpackage/200";
        AppVersion appVersion = AppVersion.parseName(validAmiName);
        assertNotNull(appVersion);
        assertEquals("test-package", appVersion.getPackageName());
        assertEquals("0.1.0", appVersion.getVersion());
        assertEquals("WE-WAPP-testpackage", appVersion.getBuildJobName());
        assertEquals("200", appVersion.getBuildNumber());
        assertNull(appVersion.getCommit());
    }

}