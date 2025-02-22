package com.netflix.frigga.ami;

public class GeneratedTestGetChangelist {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void testGetChangelist() {
        assertNull(appVersion.getChangelist());
    }

}