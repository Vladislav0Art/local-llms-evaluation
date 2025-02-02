package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName {

    private String packageName;
    private String version;
    private String buildJobName;
    private String buildNumber;
    private String commit;

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
}

public class AppVersionData {

    private Pattern appVersionPattern;

    public static void testParseNameValidAppPattern() {
        appVersionPattern = Pattern.compile("ami-name");
        when(appVersionPattern.matcher("ami-name").matches()).thenReturn(true);
        AppVersion parsedName = AppVersion.parseName("ami-name");
        assertNotNull(parsedName);
    }

    public static void testParseNameInvalidAppPattern() {
        appVersionPattern = Pattern.compile("ami-name");
        when(appVersionPattern.matcher("ami-name").matches()).thenReturn(false);
        AppVersion parsedName = AppVersion.parseName("ami-name");
        assertNull(parsedName);
    }
}

public class GeneratedTest {

    @Mock
    private AppVersionData appVersionData;

    @Before
    public void setup() {
        appVersionData.testParseNameValidAppPattern();
    }

    @Test
    public void testGetPackageName() {
        when(appVersionData.appVersionPattern.matcher("ami-name").matches()).thenReturn(true);
        AppVersion parsedName = AppVersion.parseName("ami-name");
        assertNotNull(parsedName.getPackageName());
    }

}