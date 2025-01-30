package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCompareToItselfTest {

    @Test
    public void compareToItselfTest() {
        String validAmiName = "package-1.6.0-h879547";
        AppVersion appVersion = AppVersion.parseName(validAmiName);
        int result = appVersion.compareTo(appVersion);
        Assert.assertEquals(0, result);
    }

}