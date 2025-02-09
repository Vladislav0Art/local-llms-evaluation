package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCompareToLessThanTest {

    @Test
    public void compareToLessThanTest() {
        AppVersion version1 = AppVersion.parseName("appversion-test");
        AppVersion version2 = AppVersion.parseName("appversion-test2");
        int result = version1.compareTo(version2);
        Assert.assertTrue(result < 0);
    }

}