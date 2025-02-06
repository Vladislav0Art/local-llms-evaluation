package com.netflix.frigga.ami;

public class GeneratedGetVersion_[AnyString]

Test {


    private AppVersion appVersion;
    private String amiName;

    @Test
    public void getVersion_[ AnyString]Test() {
        String version = "1.0";
        appVersion = new AppVersion(version);
        assertEquals(version, appVersion.getVersion());
    }

}