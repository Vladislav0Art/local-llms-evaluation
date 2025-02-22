package com.netflix.frigga.ami;

public class GeneratedTestHashCode {

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
    public void testHashCode() {
        assertEquals(1, appVersion.hashCode());
    }

}