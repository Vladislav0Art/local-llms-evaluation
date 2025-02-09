package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsNullTest {

    @Test
    public void equalsNullTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertFalse(version.equals(null));
    }

}