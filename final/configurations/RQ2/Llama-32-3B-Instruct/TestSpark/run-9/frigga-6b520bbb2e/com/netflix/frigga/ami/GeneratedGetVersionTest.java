package com.netflix.frigga.ami;

public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        AppVersion appVersion = new AppVersion();
        assertNotNull(appVersion.getVersion());
    }

}