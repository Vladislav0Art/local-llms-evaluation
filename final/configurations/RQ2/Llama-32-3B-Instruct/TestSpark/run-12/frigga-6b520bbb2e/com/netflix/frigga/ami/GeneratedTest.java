package com.netflix.frigga.ami;

public class GeneratedTest {

    private String packageName;
    private String version;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public boolean isPackageNameNotNull() {
        return packageName != null && !packageName.isEmpty();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isVersionNotNull() {
        return version != null && !version.isEmpty();
    }
}

public class GeneratedTest {

    private AppVersion appVersion;

    @Before
    public void setup() {
        appVersion = new AppVersion();
        appVersion.setPackageName("test");
        appVersion.setVersion("test");
    }

    @Test
    public void parseName_AmiName_ParsesSuccessfully() {
        String amiName = "ami-0e4a7d9f-2d64-43c5-bb11-8a7d81ea5604";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

    @Test
    public void parseName_InvalidAmiName_ThrowsException() {
        String amiName = "invalid-ami-name";
        try {
            AppVersion.parseName(amiName);
            fail("Expected exception");
        } catch (Exception e) {
            // Expected
        }
    }

    @Test
    public void getAppVersionPattern_PatternReturnsExpectedValue() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("ami-0e4a7d9f-2d64-43c5-bb11-8a7d81ea5604").find());
    }

}