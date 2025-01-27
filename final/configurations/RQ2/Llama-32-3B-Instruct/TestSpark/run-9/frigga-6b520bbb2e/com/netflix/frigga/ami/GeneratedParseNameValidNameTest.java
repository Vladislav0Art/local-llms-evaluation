package com.netflix.frigga.ami;

public class GeneratedParseNameValidNameTest {

    @Test
    public void parseNameValidNameTest() {
        String amiName = "1.2.3";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertEquals("1.2.3", parsedAppVersion.getVersion());
        assertNull(parsedAppVersion.getCommit());
    }

}