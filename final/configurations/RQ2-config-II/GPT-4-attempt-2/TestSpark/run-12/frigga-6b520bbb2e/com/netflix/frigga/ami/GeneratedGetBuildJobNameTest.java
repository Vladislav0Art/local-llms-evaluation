package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetBuildJobNameTest {

    @Test
    public void getBuildJobNameTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertEquals("build-job", version.getBuildJobName());
    }

}