package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        String amiName = "ami-name";
        AppVersion expectedAppVersion = new AppVersion();
        AppVersion actualAppVersion = AppVersion.parseName(amiName);
        assertEquals(expectedAppVersion, actualAppVersion);
    }

}