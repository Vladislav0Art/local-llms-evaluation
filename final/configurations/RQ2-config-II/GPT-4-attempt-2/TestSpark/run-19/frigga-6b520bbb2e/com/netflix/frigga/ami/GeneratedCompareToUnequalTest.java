package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCompareToUnequalTest {

    @Test
    public void compareToUnequalTest() {
        AppVersion version1 = AppVersion.parseName("name1");
        AppVersion version2 = AppVersion.parseName("name2");
        Assert.assertNotEquals(0, version1.compareTo(version2));
    }

}