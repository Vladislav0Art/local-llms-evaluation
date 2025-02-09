package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCompareToGreaterThanTest {

    @Test
    public void compareToGreaterThanTest() {
        AppVersion version1 = AppVersion.parseName("appversion-test2");
        AppVersion version2 = AppVersion.parseName("appversion-test");
        int result = version1.compareTo(version2);
        Assert.assertTrue(result > 0);
    }

}