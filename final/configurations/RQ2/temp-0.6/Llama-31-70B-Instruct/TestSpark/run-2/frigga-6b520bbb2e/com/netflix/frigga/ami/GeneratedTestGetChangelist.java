package com.netflix.frigga.ami;

public class GeneratedTestGetChangelist {

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
    public void testGetChangelist() {
        assertNull(appVersion.getChangelist());
    }

}