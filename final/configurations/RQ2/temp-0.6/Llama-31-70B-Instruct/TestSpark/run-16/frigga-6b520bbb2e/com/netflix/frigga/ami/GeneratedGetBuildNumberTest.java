package com.netflix.frigga.ami;

public class GeneratedGetBuildNumberTest {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void getBuildNumberTest() {
        String expected = "testBuildNumber";
        when(appVersion.getBuildNumber()).thenReturn(expected);

        assertEquals(expected, appVersion.getBuildNumber());
    }

}