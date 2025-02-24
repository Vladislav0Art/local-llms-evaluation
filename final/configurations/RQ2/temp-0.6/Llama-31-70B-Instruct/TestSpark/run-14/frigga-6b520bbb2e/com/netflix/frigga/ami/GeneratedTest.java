package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        AppVersion appVersion = new AppVersion();
        String amiName = "ami-name";

        AppVersion result = appVersion.parseName(amiName);

        assertNotNull(result);
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion = new AppVersion();
        AppVersion other = new AppVersion();

        int result = appVersion.compareTo(other);

        assertTrue(result > 0);
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

        assertNotNull(result);
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = new AppVersion();

        String result = appVersion.getVersion();

        assertNotNull(result);
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = new AppVersion();

        String result = appVersion.getBuildJobName();

        assertNotNull(result);
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = new AppVersion();

        String result = appVersion.getBuildNumber();

        assertNotNull(result);
    }

}