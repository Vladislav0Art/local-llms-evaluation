package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        AppVersion appVersion = new AppVersion();
        String name = "test";
        AppVersion result = appVersion.parseName(name);
        assertNotNull(result);
    }

    @Test
    public void parseNameNullTest() {
        AppVersion appVersion = new AppVersion();
        String name = null;
        AppVersion result = appVersion.parseName(name);
        assertNull(result);
    }

    @Test
    public void parseNameEmptyTest() {
        AppVersion appVersion = new AppVersion();
        String name = "";
        AppVersion result = appVersion.parseName(name);
        assertNotNull(result);
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(0, result);
    }

    @Test
    public void compareToNullTest() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = null;
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(1, result);
    }

    @Test
    public void getAppVersionPatternTest() {
        AppVersion appVersion = new AppVersion();
        Pattern result = appVersion.getAppVersionPattern();
        assertNotNull(result);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = new AppVersion();
        String result = appVersion.getPackageName();
        assertNull(result);
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = new AppVersion();
        String result = appVersion.getVersion();
        assertNull(result);
    }

}