package com.netflix.frigga.ami;

public class GeneratedGetPackageName_[AnyString]

Test {


    private AppVersion appVersion;
    private String amiName;

    @Test
    public void getPackageName_[ AnyString]Test() {
        String packageName = "any-name";
        appVersion = new AppVersion(packageName);
        assertEquals(packageName, appVersion.getPackageName());
    }

}