package com.netflix.frigga.ami;

public class GeneratedTestGetPackageJson {

    @Test
    public void testGetPackageJson() {
        String packageName = "ami-abc123";
        AppVersion appVersion = AppVersion.parseName(packageName);
        assertEquals(packageName, appVersion.getPackageName());
    }

}