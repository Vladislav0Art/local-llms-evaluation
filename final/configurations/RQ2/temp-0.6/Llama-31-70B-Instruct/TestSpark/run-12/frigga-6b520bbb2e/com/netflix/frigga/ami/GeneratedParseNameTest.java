package com.netflix.frigga.ami;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        AppVersion appVersion = new AppVersion();
        String amiName = "test1";

        AppVersion result = appVersion.parseName(amiName);

        assertNotNull(result);
    }

}