package com.netflix.frigga.ami;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void parseNameTest() {
        String amiName = "";
        AppVersion result = AppVersion.parseName(amiName);
        assertNull(result);
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern result = AppVersion.getAppVersionPattern();
        assertNotNull(result);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getChangelist());
    }

}