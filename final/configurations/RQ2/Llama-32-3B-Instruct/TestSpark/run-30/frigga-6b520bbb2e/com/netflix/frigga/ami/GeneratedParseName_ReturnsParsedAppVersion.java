package com.netflix.frigga.ami;

public class GeneratedParseName_ReturnsParsedAppVersion {

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
    public void parseName_ReturnsParsedAppVersion() {
        when(nameConstants.getChangelist()).thenReturn("changelist");
        AppVersion result = AppVersion.parseName(NameConstants.PACKAGES);
        assertNotNull(result);
    }

}