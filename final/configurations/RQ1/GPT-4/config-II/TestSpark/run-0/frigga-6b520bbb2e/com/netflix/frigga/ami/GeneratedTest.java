package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;

public class GeneratedTest {

    @Test
    public void parseNameNullTest() {
        Assert.assertNull(AppVersion.parseName(null));
    }

    @Test
    public void parseNameInvalidTextTest() {
        String text = "sub-1.0.0-586499.h150/JENKINS/build123";
        Assert.assertNull(AppVersion.parseName(text));
    }

    @Test
    public void parseNameValidTextTest() {
        Assert.assertNotNull(AppVersion.parseName("subscriberha-1.0.0-h586499.h150/JENKINS/150"));
    }

    @Test
    public void compareToTest() {
        AppVersion version1 = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/JENKINS/150");
        AppVersion version2 = AppVersion.parseName("subscriberha-1.0.0-h586500.h150/JENKINS/150");
        Assert.assertTrue(version1.compareTo(version2) < 0);
    }

    @Test
    public void nullSafeStringComparatorBothNullTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/JENKINS/150");
        Assert.assertEquals(0, appVersion.compareTo(appVersion));
    }

    @Test
    public void nullSafeStringComparatorBothNotNullTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/JENKINS/150");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586500.h150/JENKINS/150");
        Assert.assertNotEquals(0, appVersion.compareTo(appVersion2));
    }

    @Test
    public void getAppVersionPatternTest() {
        Matcher matcher = AppVersion.getAppVersionPattern().matcher("subscriberha-1.0.0-h586499.h150/JENKINS/150");
        Assert.assertTrue(matcher.matches());
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/JENKINS/150");
        Assert.assertEquals("subscriberha", appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/JENKINS/150");
        Assert.assertEquals("1.0.0", appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/JENKINS/150");
        Assert.assertEquals("JENKINS", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/JENKINS/150");
        Assert.assertEquals("150", appVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/JENKINS/150");
        Assert.assertEquals("h150", appVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/JENKINS/150");
        Assert.assertEquals("h150", appVersion.getChangelist());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/JENKINS/150");
        String expected = "AppVersion [packageName=subscriberha, version=1.0.0, " +
                "buildJobName=JENKINS, buildNumber=150, changelist=h150]";
        Assert.assertEquals(expected, appVersion.toString());
    }

    @Test
    public void equalsTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/JENKINS/150");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/JENKINS/150");
        Assert.assertTrue(appVersion.equals(appVersion2));
    }

}