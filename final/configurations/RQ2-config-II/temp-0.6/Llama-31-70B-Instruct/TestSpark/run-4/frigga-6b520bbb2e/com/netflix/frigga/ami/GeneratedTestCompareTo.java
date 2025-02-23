package com.netflix.frigga.ami;

public class GeneratedTestCompareTo {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
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

}