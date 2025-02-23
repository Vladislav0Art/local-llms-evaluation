package com.netflix.frigga.ami;

public class GeneratedTestGetVersion {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void testGetVersion() {
        String expected = "0.0.1";
        String actual = appVersion.getVersion();
        assertEquals(expected, actual);
    }

}