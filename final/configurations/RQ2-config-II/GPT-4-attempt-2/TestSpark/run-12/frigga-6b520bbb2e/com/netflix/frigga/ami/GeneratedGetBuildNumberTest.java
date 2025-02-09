package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetBuildNumberTest {

    @Test
    public void getBuildNumberTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertEquals("1", version.getBuildNumber());
    }

}