package com.netflix.frigga.ami;

public class GeneratedTest {

    private String packageName;
    private String buildNumber;

    public static AppVersion parseName(String name) {
        return new AppVersion();
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getBuildNumber() {
        return buildNumber;
    }
}

public class AppVersionTest {

    private static final NameConstants nameConstants = new NameConstants();

    @BeforeAll
    public static void setup() {
        // set up the mock object
    }

}