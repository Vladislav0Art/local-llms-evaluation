package com.netflix.frigga.ami;

public class GeneratedTest {

    private String buildNumber;
    private String buildJobName;
    private String packageName;

    public AppVersion() {
        this.buildNumber = "h586499";
        this.buildJobName = "";
        this.packageName = "subscriberha";
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getBuildJobName() {
        return buildJobName;
    }

    public void setBuildJobName(String buildJobName) {
        this.buildJobName = buildJobName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
}

public class TestSpark {

    @Test
    public void parseName_ValidAppPattern_ReturnsParsedAppVersion() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNotNull(parsedAppVersion);
    }

    @Test
    public void parseName_InValidAppPattern_ReturnsNull() {
        String amiName = "invalid-app-pattern";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion);
    }

    @Test
    public void getPackageName_ReturnsParsedPackage_WhenAvailable() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertEquals("subscriberha", parsedAppVersion.getPackageName());
    }

}