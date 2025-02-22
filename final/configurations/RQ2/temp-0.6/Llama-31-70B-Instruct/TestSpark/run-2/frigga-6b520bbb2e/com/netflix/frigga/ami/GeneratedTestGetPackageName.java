package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName {

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
    public void testGetPackageName() {
        assertNull(appVersion.getPackageName());
    }

}