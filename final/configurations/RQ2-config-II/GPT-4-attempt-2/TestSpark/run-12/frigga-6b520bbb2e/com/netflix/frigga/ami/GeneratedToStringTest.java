package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertEquals("ami-example-hvm-1.0.0", version.toString());
    }

}