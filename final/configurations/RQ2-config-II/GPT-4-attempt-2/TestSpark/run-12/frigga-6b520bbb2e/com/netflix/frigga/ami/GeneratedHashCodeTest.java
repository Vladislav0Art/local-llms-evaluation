package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertNotNull(version.hashCode());
    }

}