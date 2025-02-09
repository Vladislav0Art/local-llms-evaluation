package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseNameValidInputTest() {
        AppVersion result = AppVersion.parseName("validAmiName");
        Assert.assertNotNull(result);
    }

    @Test
    public void parseNameInvalidInputTest() {
        AppVersion.parseName(null);
    }

    @Test
    public void compareToEqualTest() {
        AppVersion version1 = AppVersion.parseName("validAmiName_1");
        AppVersion version2 = AppVersion.parseName("validAmiName_1");
        int result = version1.compareTo(version2);
        Assert.assertEquals(0, result);
    }

    @Test
    public void compareToLessThanTest() {
        AppVersion version1 = AppVersion.parseName("validAmiName_1");
        AppVersion version2 = AppVersion.parseName("validAmiName_2");
        int result = version1.compareTo(version2);
        Assert.assertTrue(result < 0);
    }

    @Test
    public void compareToGreaterThanTest() {
        AppVersion version1 = AppVersion.parseName("validAmiName_2");
        AppVersion version2 = AppVersion.parseName("validAmiName_1");
        int result = version1.compareTo(version2);
        Assert.assertTrue(result > 0);
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern result = AppVersion.getAppVersionPattern();
        Assert.assertNotNull(result);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("validAmiName_2");
        String packageName = appVersion.getPackageName();
        Assert.assertEquals("validAmiName", packageName);
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("validAmiName_2");
        String result = appVersion.toString();
        Assert.assertNotNull(result);
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("validAmiName_2");
        int result = appVersion.hashCode();
        Assert.assertTrue(result > 0);
    }

    @Test
    public void equalsTest() {
        AppVersion version1 = AppVersion.parseName("validAmiName_2");
        AppVersion version2 = AppVersion.parseName("validAmiName_2");
        Assert.assertTrue(version1.equals(version2));
    }

}