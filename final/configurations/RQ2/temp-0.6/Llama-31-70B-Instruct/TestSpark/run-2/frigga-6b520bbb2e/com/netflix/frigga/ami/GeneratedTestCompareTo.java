package com.netflix.frigga.ami;

public class GeneratedTestCompareTo {

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
    public void testCompareTo() {
        AppVersion other = new AppVersion();
        assertEquals(0, appVersion.compareTo(other));
    }

}