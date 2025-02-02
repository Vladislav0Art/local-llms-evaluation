package com.netflix.frigga.ami;

public class GeneratedTestParseNameInvalidAppPattern {

    private String packageName;
    private String version;

    public static AppVersion parseName(String amiName) {
        // implementation here
        return new AppVersion();
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getVersion() {
        return this.version;
    }
}

public class AppVersionData {
    private Pattern appVersionPattern;

    public static void testParseNameValidAppPattern() {
        appVersionPattern = Pattern.compile("ami-name");
        when(appVersionPattern.matcher("ami-name").matches()).thenReturn(true);
        AppVersion parsedName = AppVersion.parseName("ami-name");
        assertNotNull(parsedName.getPackageName());
    }

    public static void testParseNameInvalidAppPattern() {
        appVersionPattern = Pattern.compile("ami-name");
        when(appVersionPattern.matcher("ami-name").matches()).thenReturn(false);
        AppVersion parsedName = AppVersion.parseName("ami-name");
        assertNull(parsedName.getPackageName());
    }
}

public class GeneratedTest {
    @Mock
    private AppVersionData appVersionData;

    @Before
    public void setup() {
        when(appVersionData.appVersionPattern.matcher("ami-name").matches()).thenReturn(true);
        AppVersion parsedName = AppVersion.parseName("ami-name");
        assertNotNull(parsedName.getPackageName());
    }

    @Test
    public void testParseNameInvalidAppPattern() {
        when(appVersionData.appVersionPattern.matcher("other-name").matches()).thenReturn(false);
        AppVersion parsedName = AppVersion.parseName("other-name");
        assertNull(parsedName.getPackageName());
    }

}