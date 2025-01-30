package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCompareToNullOtherTest {

    @Test
    public void compareToNullOtherTest() {
        String validAmiName = "package-1.6.0-h879547";
        AppVersion appVersion = AppVersion.parseName(validAmiName);
        int result = appVersion.compareTo(null);
        Assert.assertEquals(1, result);
    }

}