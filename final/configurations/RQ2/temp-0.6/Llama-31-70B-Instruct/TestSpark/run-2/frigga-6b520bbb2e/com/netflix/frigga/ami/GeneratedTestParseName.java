package com.netflix.frigga.ami;

public class GeneratedTestParseName {

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
    public void testParseName() {
        assertNull(AppVersion.parseName(null));
    }

}