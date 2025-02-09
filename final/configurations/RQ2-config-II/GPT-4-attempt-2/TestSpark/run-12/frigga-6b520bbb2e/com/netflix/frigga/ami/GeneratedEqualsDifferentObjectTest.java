package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsDifferentObjectTest {

    @Test
    public void equalsDifferentObjectTest() {
        AppVersion version1 = AppVersion.parseName("ami-example-hvm");
        AppVersion version2 = AppVersion.parseName("ami-example2-hvm");
        Assert.assertFalse(version1.equals(version2));
    }

}