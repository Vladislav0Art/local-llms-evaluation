package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void parseNameValidInputTest() {
        String amiName = "ami-example-hvm";
        AppVersion result = AppVersion.parseName(amiName);
        Assert.assertNotNull(result);
    }

    @Test
    public void parseNameInvalidInputTest() {
        String amiName = "";
        AppVersion.parseName(amiName);
    }

    @Test
    public void compareToEqualVersionTest() {
        AppVersion version1 = AppVersion.parseName("ami-example-hvm");
        AppVersion version2 = AppVersion.parseName("ami-example-hvm");
        Assert.assertEquals(0, version1.compareTo(version2));
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern result = AppVersion.getAppVersionPattern();
        Assert.assertNotNull(result);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertEquals("ami-example-hvm", version.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertEquals("1.0.0", version.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertEquals("build-job", version.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertEquals("1", version.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertEquals("commit-hash", version.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertEquals("changelist", version.getChangelist());
    }

    @Test
    public void toStringTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertEquals("ami-example-hvm-1.0.0", version.toString());
    }

    @Test
    public void hashCodeTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertNotNull(version.hashCode());
    }

    @Test
    public void equalsSameObjectTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertTrue(version.equals(version));
    }

    @Test
    public void equalsDifferentObjectTest() {
        AppVersion version1 = AppVersion.parseName("ami-example-hvm");
        AppVersion version2 = AppVersion.parseName("ami-example2-hvm");
        Assert.assertFalse(version1.equals(version2));
    }

    @Test
    public void equalsNullTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertFalse(version.equals(null));
    }

}