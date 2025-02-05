package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        AppVersion appVersion = AppVersion.parseName("hai-3.4.5-h33");
        Assert.assertNotNull(appVersion);
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("hai-3.4.5-h33");
        AppVersion appVersion2 = AppVersion.parseName("hai-3.4.5-h34");
        int compareValue = appVersion1.compareTo(appVersion2);
        Assert.assertTrue(compareValue < 0);
    }

    @Test
    public void getAppVersionPatternTest() {
        Assert.assertNotNull(AppVersion.getAppVersionPattern());
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("hai-3.4.5-h33");
        Assert.assertEquals(appVersion.getPackageName(), "hai");
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("hai-3.4.5-h33");
        Assert.assertEquals(appVersion.getVersion(), "3.4.5");
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("hai-3.4.5-h33");
        Assert.assertEquals(appVersion.getBuildJobName(), "h33");
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("a-3-h33");
        Assert.assertEquals(appVersion.getBuildNumber(), "3");
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("hai-3.4.5-h33");
        Assert.assertNull(appVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("hai-3.4.5-h33");
        Assert.assertNull(appVersion.getChangelist());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("hai-3.4.5-h33");
        Assert.assertEquals(appVersion.toString(), "hai-3.4.5-h33");
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("hai-3.4.5-h33");
        Assert.assertNotNull(appVersion.hashCode());
    }

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("hai-3.4.5-h33");
        AppVersion appVersion2 = AppVersion.parseName("hai-3.4.5-h33");
        Assert.assertTrue(appVersion1.equals(appVersion2));
    }

}