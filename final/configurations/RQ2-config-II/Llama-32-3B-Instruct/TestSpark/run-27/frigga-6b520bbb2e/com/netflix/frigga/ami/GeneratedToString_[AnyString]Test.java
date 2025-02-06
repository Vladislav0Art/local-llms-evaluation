package com.netflix.frigga.ami;

public class GeneratedToString_[AnyString]

Test {


    private AppVersion appVersion;
    private String amiName;

    @Test
    public void toString_[ AnyString]Test() {
        String packageName = "any-name";
        String version = "1.0";
        String buildNumber = "12345";
        appVersion = new AppVersion(packageName, version, buildNumber);
        assertNotNull(appVersion.toString());
    }

}