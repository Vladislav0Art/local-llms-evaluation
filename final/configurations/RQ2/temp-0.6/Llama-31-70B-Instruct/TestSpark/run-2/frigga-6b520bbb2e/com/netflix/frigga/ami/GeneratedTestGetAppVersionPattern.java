package com.netflix.frigga.ami;

public class GeneratedTestGetAppVersionPattern {

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
    public void testGetAppVersionPattern() {
        assertNotNull(AppVersion.getAppVersionPattern());
    }

}