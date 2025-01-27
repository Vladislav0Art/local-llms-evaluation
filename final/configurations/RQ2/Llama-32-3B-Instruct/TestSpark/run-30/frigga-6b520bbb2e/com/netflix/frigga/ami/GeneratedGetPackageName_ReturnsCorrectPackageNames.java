package com.netflix.frigga.ami;

public class GeneratedGetPackageName_ReturnsCorrectPackageNames {

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

    @Mock
    private NameConstants nameConstants;

    @BeforeAll
    public static void setup() {
        // set up the mock object
    }

    @Test
    public void getPackageName_ReturnsCorrectPackageNames() {
        when(nameConstants.getChangelist()).thenReturn("changelist");
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName(NameConstants.PACKAGES);
        assertEquals(NameConstants.PACKAGES, appVersion.getPackageName());
    }

}