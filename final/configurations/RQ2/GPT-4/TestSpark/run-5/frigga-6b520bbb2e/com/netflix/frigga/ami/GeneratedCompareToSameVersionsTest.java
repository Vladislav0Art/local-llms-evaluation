package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCompareToSameVersionsTest {

    @Test
    public void compareToSameVersionsTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        AppVersion otherVersion = AppVersion.parseName("version1");
        Assert.assertEquals(0, thisVersion.compareTo(otherVersion));
    }

}