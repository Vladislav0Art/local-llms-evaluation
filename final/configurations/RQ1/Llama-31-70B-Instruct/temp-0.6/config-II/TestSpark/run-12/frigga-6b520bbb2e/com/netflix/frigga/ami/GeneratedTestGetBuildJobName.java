package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobName {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void testGetBuildJobName() {
        assertNull(appVersion.getBuildJobName());
    }

}