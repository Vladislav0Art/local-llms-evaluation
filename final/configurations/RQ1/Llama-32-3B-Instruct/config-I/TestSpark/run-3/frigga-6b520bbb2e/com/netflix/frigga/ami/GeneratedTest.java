package com.netflix.frigga.ami;

public class GeneratedTest {

    private static Pattern appVersionPattern = null;

    public static void testParseNameValidAppPattern() {
        if (appVersionPattern == null) {
            appVersionPattern = Pattern.compile("ami-name");
        }
        Assert.assertTrue(appVersionPattern.matcher("ami-name").matches());
        AppVersion parsedName = AppVersion.parseName("ami-name");
        assertNotNull(parsedName.getPackageName());
    }

    public static void testParseNameInvalidAppPattern() {
        if (appVersionPattern == null) {
            appVersionPattern = Pattern.compile("ami-name");
        }
        Assert.assertFalse(appVersionPattern.matcher("ami-name").matches());
        AppVersion parsedName = AppVersion.parseName("ami-name");
        assertNull(parsedName.getPackageName());
    }

    public static void initPattern() {
        if (appVersionPattern == null) {
            appVersionPattern = Pattern.compile("ami-name");
        }
    }
}

public class GeneratedTest {
    @Mock
    private AppVersion appVersion;

    @BeforeAll
    public void setup() {
        AppVersionData.initPattern();
        when(appVersion.getPackageName()).thenReturn("packageName");
    }

}