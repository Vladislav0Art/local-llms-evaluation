package com.netflix.frigga.ami;

public class GeneratedTestGetCommit {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void testGetCommit() {
        assertNull(appVersion.getCommit());
    }

}