package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertEquals("1.0.0", version.getVersion());
    }

}