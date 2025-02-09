package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCompareToEqualVersionTest {

    @Test
    public void compareToEqualVersionTest() {
        AppVersion version1 = AppVersion.parseName("ami-example-hvm");
        AppVersion version2 = AppVersion.parseName("ami-example-hvm");
        Assert.assertEquals(0, version1.compareTo(version2));
    }

}