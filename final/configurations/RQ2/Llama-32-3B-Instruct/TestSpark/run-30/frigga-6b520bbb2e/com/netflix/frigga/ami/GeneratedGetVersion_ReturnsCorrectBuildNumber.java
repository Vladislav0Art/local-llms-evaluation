package com.netflix.frigga.ami;

public class GeneratedGetVersion_ReturnsCorrectBuildNumber {

    @Deprecated
    public String getChangelist() {
        return "changelist";
    }

    public static final String AMI_NAME = "ami-name";
    public static final String PACKAGES = "packages";
}

public class AppVersion {
    private String packageName;
    private String buildNumber;

    public static AppVersion parseName(String name) {
        // implement logic to parse the name
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

    @Before
    public void setup() {
        // set up the mock object
    }

    @Test
    public void getVersion_ReturnsCorrectBuildNumber() {
        when(nameConstants.getChangelist()).thenReturn("changelist");
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildNumber("buildnumber");
        assertEquals("buildnumber", appVersion.getBuildNumber());
    }

}