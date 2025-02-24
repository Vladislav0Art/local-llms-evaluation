package com.netflix.frigga.ami;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    private AppVersion appVersion;

    @Test
    public void parseNameTest() {
        String amiName = "ami-name";
        AppVersion expectedAppVersion = new AppVersion();

        AppVersion actualAppVersion = AppVersion.parseName(amiName);

        assertEquals(expectedAppVersion, actualAppVersion);
    }

    @Test
    public void compareToTest() {
        AppVersion other = new AppVersion();

        int result = appVersion.compareTo(other);

        assertEquals(0, result);
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern expectedPattern = Pattern.compile("");

        Pattern actualPattern = AppVersion.getAppVersionPattern();

        assertEquals(expectedPattern, actualPattern);
    }

    @Test
    public void getPackageNameTest() {
        String expectedPackageName = "package-name";

        String actualPackageName = appVersion.getPackageName();

        assertEquals(expectedPackageName, actualPackageName);
    }

    @Test
    public void getVersionTest() {
        String expectedVersion = "version";

        String actualVersion = appVersion.getVersion();

        assertEquals(expectedVersion, actualVersion);
    }

    @Test
    public void getBuildJobNameTest() {
        String expectedBuildJobName = "build-job-name";

        String actualBuildJobName = appVersion.getBuildJobName();

        assertEquals(expectedBuildJobName, actualBuildJobName);
    }

}