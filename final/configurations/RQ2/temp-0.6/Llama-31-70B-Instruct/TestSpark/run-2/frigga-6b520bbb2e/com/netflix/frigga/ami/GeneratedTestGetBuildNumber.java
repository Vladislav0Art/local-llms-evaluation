package com.netflix.frigga.ami;

public class GeneratedTestGetBuildNumber {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @After
    public void tearDown() {
        appVersion = null;
    }

    @Test
    public void testGetBuildNumber() {
        assertNull(appVersion.getBuildNumber());
    }

}