package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsDifferentClassTest {

    @Test
    public void equalsDifferentClassTest() {
        String validAmiName = "package-1.6.0-h879547";
        AppVersion appVersion = AppVersion.parseName(validAmiName);
        Assert.assertFalse(appVersion.equals(new String()));
    }

}