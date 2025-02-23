package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void testGetPackageName() {
        String expected = "test1";
        String actual = appVersion.getPackageName();
        assertEquals(expected, actual);
    }

}