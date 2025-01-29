package com.netflix.frigga.ami;

public class GeneratedTestSetBuildNumber {

    @Test
    public void testSetBuildNumber() {
        AppVersion appVersion = new AppVersion();
        String packageName = "ami-name-123";
        System.out.println("Before setBuildNumber: name=" + appVersion.getName());

        buildNumberParser.parseBuildNumber(packageName);
        appVersion.setPackageName(packageName);

        System.out.println("After setBuildNumber: name=" + appVersion.getName());
    }

}