package com.netflix.frigga.ami;

public class GeneratedCompareToTest {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void compareToTest() {
        AppVersion other = new AppVersion();
        int expected = 0;
        when(appVersion.compareTo(other)).thenReturn(expected);

        assertEquals(expected, appVersion.compareTo(other));
    }

}