package com.netflix.frigga.ami;

public class GeneratedTestGetCommit {

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
    public void testGetCommit() {
        assertNull(appVersion.getCommit());
    }

}