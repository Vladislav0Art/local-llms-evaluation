package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetPackageNameTest {

    @Test
    public void getPackageNameTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertEquals("ami-example-hvm", version.getPackageName());
    }

}