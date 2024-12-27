package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseNameValidAmiNameTest() {
        String amiName = "validAmi";
        AppVersion appVersion = AppVersion.parseName(amiName);

        Assert.assertNotNull(appVersion);
    }

    @Test
    public void parseNameNullAmiNameTest() {
        String amiName = null;
        AppVersion appVersion = AppVersion.parseName(amiName);

        Assert.assertNull(appVersion);
    }

    @Test
    public void compareToEqualAppVersionTest() {
        AppVersion appVersion1 = AppVersion.parseName("validAmi");
        AppVersion appVersion2 = AppVersion.parseName("validAmi");

        // they are equal so compareTo method should return 0
        Assert.assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        Assert.assertNotNull(pattern);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("validAmi");
        Assert.assertEquals("validAmi", appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("validAmi");
        Assert.assertEquals("0.1", appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("validAmi");
        Assert.assertEquals("AmiBuildJob", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("validAmi");
        Assert.assertEquals("1", appVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("validAmi");
        Assert.assertEquals("asa9s7jd", appVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("validAmi");
        Assert.assertEquals("Change", appVersion.getChangelist());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("validAmi");
        Assert.assertEquals("validAmi", appVersion.toString());
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("validAmi");
        Assert.assertNotNull(appVersion.hashCode());
    }

    @Test
    public void equalsSameObjectTest() {
        AppVersion appVersion = AppVersion.parseName("validAmi");
        Assert.assertTrue(appVersion.equals(appVersion));
    }

    @Test
    public void equalsDifferentObjectTypeTest() {
        AppVersion appVersion = AppVersion.parseName("validAmi");
        Assert.assertFalse(appVersion.equals(new Object()));
    }

    @Test
    public void equalsNullTest() {
        AppVersion appVersion = AppVersion.parseName("validAmi");
        Assert.assertFalse(appVersion.equals(null));
    }

    @Test
    public void equalsDifferentAppVersionTest() {
        AppVersion appVersion1 = AppVersion.parseName("validAmi");
        AppVersion appVersion2 = AppVersion.parseName("invalidAmi");
        Assert.assertFalse(appVersion1.equals(appVersion2));
    }

}