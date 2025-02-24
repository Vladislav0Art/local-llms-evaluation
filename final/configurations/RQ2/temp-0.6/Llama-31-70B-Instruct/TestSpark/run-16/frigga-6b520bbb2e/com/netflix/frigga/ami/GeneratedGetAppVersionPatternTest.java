package com.netflix.frigga.ami;

public class GeneratedGetAppVersionPatternTest {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern expected = Pattern.compile("[a-z]+");
        when(appVersion.getAppVersionPattern()).thenReturn(expected);

        assertEquals(expected, appVersion.getAppVersionPattern());
    }

}