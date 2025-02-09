package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedCompareToEqualTest {

    @Test
    public void compareToEqualTest() {
        AppVersion version1 = AppVersion.parseName("validAmiName_1");
        AppVersion version2 = AppVersion.parseName("validAmiName_1");
        int result = version1.compareTo(version2);
        Assert.assertEquals(0, result);
    }

}