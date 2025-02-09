package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCompareToEqualTest {

    @Test
    public void compareToEqualTest() {
        AppVersion version1 = AppVersion.parseName("appversion-test");
        AppVersion version2 = AppVersion.parseName("appversion-test");
        int result = version1.compareTo(version2);
        Assert.assertEquals(0, result);
    }

}