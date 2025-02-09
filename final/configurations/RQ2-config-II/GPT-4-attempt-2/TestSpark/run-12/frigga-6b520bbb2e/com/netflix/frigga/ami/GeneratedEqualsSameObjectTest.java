package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsSameObjectTest {

    @Test
    public void equalsSameObjectTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertTrue(version.equals(version));
    }

}