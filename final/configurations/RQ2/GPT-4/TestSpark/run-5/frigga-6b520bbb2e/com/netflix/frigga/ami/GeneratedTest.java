package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void parseNameValidAmiNameTest() {
        String validAmiName = "validAmiName";
        Assert.assertNotNull(AppVersion.parseName(validAmiName));
    }

    @Test
    public void parseNameNullAmiNameTest() {
        AppVersion.parseName(null);
    }

    @Test
    public void compareToDifferentVersionsTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        AppVersion otherVersion = AppVersion.parseName("version2");
        Assert.assertNotEquals(0, thisVersion.compareTo(otherVersion));
    }

    @Test
    public void compareToSameVersionsTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        AppVersion otherVersion = AppVersion.parseName("version1");
        Assert.assertEquals(0, thisVersion.compareTo(otherVersion));
    }

    @Test
    public void getAppVersionPatternTest() {
        Assert.assertNotNull(AppVersion.getAppVersionPattern());
    }

    @Test
    public void getPackageNameTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        Assert.assertNotNull(thisVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        Assert.assertNotNull(thisVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        Assert.assertNotNull(thisVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        Assert.assertNotNull(thisVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        Assert.assertNotNull(thisVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        Assert.assertNotNull(thisVersion.getChangelist());
    }

    @Test
    public void toStringTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        Assert.assertNotNull(thisVersion.toString());
    }

    @Test
    public void equalsDifferentVersionsTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        AppVersion otherVersion = AppVersion.parseName("version2");
        Assert.assertNotEquals(thisVersion, otherVersion);
    }

    @Test
    public void equalsSameVersionsTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        AppVersion otherVersion = AppVersion.parseName("version1");
        Assert.assertEquals(thisVersion, otherVersion);
    }

    @Test
    public void equalsNullTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        Assert.assertNotEquals(thisVersion, null);
    }

    @Test
    public void hashCodeTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        Assert.assertNotNull(thisVersion.hashCode());
    }

}