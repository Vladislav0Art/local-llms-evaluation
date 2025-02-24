package com.netflix.frigga.ami;

public class GeneratedParseNameTest {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void parseNameTest() {
        String amiName = "testName";
        AppVersion expected = new AppVersion();
        when(appVersion.parseName(amiName)).thenReturn(expected);

        assertEquals(expected, appVersion.parseName(amiName));
    }

}