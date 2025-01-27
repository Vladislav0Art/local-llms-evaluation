package com.netflix.frigga.ami;

public class GeneratedGetPackageName_WithValidName_ReturnsPackageName {

    @Test
    public void getPackageName_WithValidName_ReturnsPackageName() {
        String packageName = "my-package-name";
        String amiName = packageName + "-ami-0";
        AppVersion appVersion = new AppVersion(amiName);
        assertEquals(packageName, appVersion.getPackageName());
    }

}