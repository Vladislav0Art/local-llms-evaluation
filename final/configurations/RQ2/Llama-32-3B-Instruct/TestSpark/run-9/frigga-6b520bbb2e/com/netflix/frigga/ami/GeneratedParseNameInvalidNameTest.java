package com.netflix.frigga.ami;

public class GeneratedParseNameInvalidNameTest {

    @Test
    public void parseNameInvalidNameTest() {
        String amiName = "invalid-ami-name";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion);
    }

}