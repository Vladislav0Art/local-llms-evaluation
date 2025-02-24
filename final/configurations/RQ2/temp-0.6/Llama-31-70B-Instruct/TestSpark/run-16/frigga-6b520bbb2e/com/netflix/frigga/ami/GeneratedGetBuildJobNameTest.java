package com.netflix.frigga.ami;

public class GeneratedGetBuildJobNameTest {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void getBuildJobNameTest() {
        String expected = "testJobName";
        when(appVersion.getBuildJobName()).thenReturn(expected);

        assertEquals(expected, appVersion.getBuildJobName());
    }

}