package com.netflix.frigga.ami;

public class GeneratedTestParseName {

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

}