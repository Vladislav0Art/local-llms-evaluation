package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void testCompareTo() {
        AppVersion appVersion = new AppVersion();
        AppVersion other = new AppVersion();
        int expected = 0;
        int actual = appVersion.compareTo(other);
        assertEquals(expected, actual);
    }

}