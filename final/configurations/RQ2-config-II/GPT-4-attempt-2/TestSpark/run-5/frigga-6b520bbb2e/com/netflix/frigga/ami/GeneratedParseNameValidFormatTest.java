package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidFormatTest {

    @Test
    public void parseNameValidFormatTest() {
        AppVersion appVersion = AppVersion.parseName("app-2.5.0-h82.8af1b42");
        assertEquals("app", appVersion.getPackageName());
        assertEquals("2.5.0", appVersion.getVersion());
        assertEquals("h82", appVersion.getBuildJobName());
        assertEquals("8af1b42", appVersion.getCommit());
    }

}