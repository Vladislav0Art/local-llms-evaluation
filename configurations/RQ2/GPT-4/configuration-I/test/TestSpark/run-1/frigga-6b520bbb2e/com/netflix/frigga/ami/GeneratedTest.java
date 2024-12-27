package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        String amiName = "AppName-v001";

        AppVersion appVersion = AppVersion.parseName(amiName);

        Assert.assertNotNull(appVersion);
    }

    @Test
    public void compareToTest() {
        String amiName1 = "AppName-v001";
        String amiName2 = "AppName-v002";

        AppVersion appVersion1 = AppVersion.parseName(amiName1);
        AppVersion appVersion2 = AppVersion.parseName(amiName2);

        int result = appVersion1.compareTo(appVersion2);

        Assert.assertTrue(result < 0);
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();

        Assert.assertNotNull(pattern);
    }

    @Test
    public void getPackageNameTest() {
        String amiName = "AppName-v001";

        AppVersion appVersion = AppVersion.parseName(amiName);

        String packageName = appVersion.getPackageName();

        Assert.assertEquals("AppName", packageName);
    }

    @Test
    public void getVersionTest() {
        String amiName = "AppName-v001";

        AppVersion appVersion = AppVersion.parseName(amiName);

        String version = appVersion.getVersion();

        Assert.assertEquals("v001", version);
    }

    @Test
    public void getBuildJobNameTest() {
        String amiName = "AppName-buildJob1-v001";

        AppVersion appVersion = AppVersion.parseName(amiName);

        Assert.assertEquals("buildJob1", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        String amiName = "AppName-buildJob1-v001-001";

        AppVersion appVersion = AppVersion.parseName(amiName);

        Assert.assertEquals("001", appVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        String amiName = "AppName-buildJob1-v001-001-commit1";

        AppVersion appVersion = AppVersion.parseName(amiName);

        Assert.assertEquals("commit1", appVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        String amiName = "AppName-buildJob1-v001-001-commit1";

        AppVersion appVersion = AppVersion.parseName(amiName);

        Assert.assertEquals("commit1", appVersion.getChangelist());
    }

    @Test
    public void toStringTest() {
        String amiName = "AppName-buildJob1-v001-001-commit1";

        AppVersion appVersion = AppVersion.parseName(amiName);

        Assert.assertEquals("AppVersion{appName=AppName, version=v001, buildJobName=buildJob1, buildNumber=001, commit=commit1}", appVersion.toString());
    }

    @Test
    public void hashCodeTest() {
        String amiName = "AppName-buildJob1-v001-001-commit1";

        AppVersion appVersion = AppVersion.parseName(amiName);

        Assert.assertEquals(appVersion.hashCode(), appVersion.hashCode());
    }

    @Test
    public void equalsTest() {
        String amiName1 = "AppName-buildJob1-v001-001-commit1";
        String amiName2 = "AppName-buildJob1-v001-001-commit1";

        AppVersion appVersion1 = AppVersion.parseName(amiName1);
        AppVersion appVersion2 = AppVersion.parseName(amiName2);

        Assert.assertTrue(appVersion1.equals(appVersion2));
    }

}