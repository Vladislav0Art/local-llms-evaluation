package com.netflix.frigga.ami;

public class GeneratedParseNameEmptyStringTest {

    @Test
    public void parseNameEmptyStringTest() {
        String amiName = "";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion);
    }

}