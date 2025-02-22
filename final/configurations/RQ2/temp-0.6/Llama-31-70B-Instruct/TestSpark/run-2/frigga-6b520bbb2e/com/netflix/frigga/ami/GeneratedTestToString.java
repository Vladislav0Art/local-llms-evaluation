package com.netflix.frigga.ami;

public class GeneratedTestToString {

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
    public void testToString() {
        assertEquals("AppVersion [packageName=null, version=null, buildJobName=null, buildNumber=null, changelist=null]", appVersion.toString());
    }

}