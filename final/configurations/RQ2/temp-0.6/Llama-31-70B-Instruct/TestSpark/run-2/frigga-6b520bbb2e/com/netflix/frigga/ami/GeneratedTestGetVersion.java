package com.netflix.frigga.ami;

public class GeneratedTestGetVersion {

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
    public void testGetVersion() {
        assertNull(appVersion.getVersion());
    }

}