package com.netflix.frigga.ami;

public class GeneratedTest {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void testParseName() {
        String amiName = "test1-0.0.1-123456";
        AppVersion expected = new AppVersion();
        expected.packageName = "test1";
        expected.version = "0.0.1";
        expected.buildNumber = "123456";

        AppVersion actual = AppVersion.parseName(amiName);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompareTo() {
        AppVersion other = new AppVersion();
        other.packageName = "test1";
        other.version = "0.0.1";
        other.buildNumber = "123456";

        int expected = -1;
        int actual = appVersion.compareTo(other);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAppVersionPattern() {
        Pattern expected = Pattern.compile("([" + NameConstants.NAME_HYPHEN_CHARS + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?");
        Pattern actual = AppVersion.getAppVersionPattern();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetPackageName() {
        String expected = "test1";
        String actual = appVersion.getPackageName();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetVersion() {
        String expected = "0.0.1";
        String actual = appVersion.getVersion();
        assertEquals(expected, actual);
    }

}