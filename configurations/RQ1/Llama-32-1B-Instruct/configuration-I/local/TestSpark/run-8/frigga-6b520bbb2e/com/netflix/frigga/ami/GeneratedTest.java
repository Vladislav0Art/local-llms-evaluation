package com.netflix.frigga.ami;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testGetVersionReturnsCorrectValue() {
        String expected = "1.0.0";
        AppVersion appVersion = new AppVersion("1.9.0", "a1b2c3d4", 20220101);
        assertEquals(expected, appVersion.getVersion());
    }

    @Test
    public void testGetCommitReturnsCorrectValue() {
        String expected = " subscriberha-h150";
        AppVersion appVersion = new AppVersion("1.9.0", "a1b2c3d4", 20220101);
        assertEquals(expected, appVersion.getCommit());
    }

    @Test
    public void testToStringReturnsCorrectValue() {
        String expected = "AppVersion{appId=\"1.9.0\", commit=\"subscriberha-h150\"}";
        AppVersion appVersion = new AppVersion("1.9.0", "a1b2c3d4", 20220101);
        assertEquals(expected, appVersion.toString());
    }

    @Test
    public void testEqualsReturnsTrue() {
        AppVersion appVersion1 = new AppVersion("1.9.0", "a1b2c3d4", 20220101);
        AppVersion appVersion2 = new AppVersion("1.8.0", "a1b2c3d4", 20220102);
        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void testEqualsReturnsFalse() {
        AppVersion appVersion1 = new AppVersion("1.9.0", "a1b2c3d4", 20220101);
        AppVersion appVersion2 = new AppVersion("1.8.0", "a1b2c3d5", 20220102);
        assertFalse(appVersion1.equals(appVersion2));
    }

    @Test
    public void testToStringWithNullCommitReturnsCorrectValue() {
        String expected = "AppVersion{appId=\"1.9.0\", commit=null}";
        AppVersion appVersion = new AppVersion("1.9.0", null, 20220101);
        assertEquals(expected, appVersion.toString());
    }

    @Test
    public void testToStringWithNullCommitReturnsCorrectValue() {
        String expected = "AppVersion{appId=\"1.9.0\", commit=null}";
        AppVersion appVersion = new AppVersion("1.8.0", null, 20220102);
        assertEquals(expected, appVersion.toString());
    }

}