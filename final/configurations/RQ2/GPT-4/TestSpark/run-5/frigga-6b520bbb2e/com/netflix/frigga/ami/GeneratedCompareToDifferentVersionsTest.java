package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCompareToDifferentVersionsTest {

    @Test
    public void compareToDifferentVersionsTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        AppVersion otherVersion = AppVersion.parseName("version2");
        Assert.assertNotEquals(0, thisVersion.compareTo(otherVersion));
    }

}