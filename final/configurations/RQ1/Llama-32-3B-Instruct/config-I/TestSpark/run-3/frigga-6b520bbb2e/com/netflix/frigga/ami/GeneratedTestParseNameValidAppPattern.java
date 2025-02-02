package com.netflix.frigga.ami;

public class GeneratedTestParseNameValidAppPattern {

    private String packageName;
    private String version;
    private String buildJobName;
    private String buildNumber;
    private String commit;
    private String changelist;

    public static AppVersion parseName(String amiName) {
        // implementation here
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getVersion() {
        return this.version;
    }

    public String getBuildJobName() {
        return this.buildJobName;
    }

    public String getBuildNumber() {
        return this.buildNumber;
    }

    public String getCommit() {
        return this.commit;
    }

    public static class AppVersionData {
        private Pattern appVersionPattern;

        // method here
    }
}

public class GeneratedTest {

    @Mock
    private AppVersion.AppVersionData appVersionData;

    @Test
    public void testParseNameValidAppPattern() {
        when(appVersionData.appVersionPattern.matcher("ami-name").matches()).thenReturn(true);
        AppVersion parsedName = AppVersion.parseName("ami-name");
        assertNotNull(parsedName);
    }

}