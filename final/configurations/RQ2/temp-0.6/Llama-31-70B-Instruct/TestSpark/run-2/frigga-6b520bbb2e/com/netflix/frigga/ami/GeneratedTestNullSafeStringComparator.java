package com.netflix.frigga.ami;

public class GeneratedTestNullSafeStringComparator {

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
    public void testNullSafeStringComparator() {
        assertEquals(0, appVersion.nullSafeStringComparator(null, null));
    }

}