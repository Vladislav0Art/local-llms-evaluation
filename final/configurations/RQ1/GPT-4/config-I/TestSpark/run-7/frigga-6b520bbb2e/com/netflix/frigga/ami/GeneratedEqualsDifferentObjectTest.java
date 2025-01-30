package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsDifferentObjectTest {

    @Test
    public void equalsDifferentObjectTest() {
        String validAmiName1 = "package-1.6.0-h879547";
        AppVersion appVersion1 = AppVersion.parseName(validAmiName1);
        String validAmiName2 = "package-1.6.0-h879548";
        AppVersion appVersion2 = AppVersion.parseName(validAmiName2);
        Assert.assertFalse(appVersion1.equals(appVersion2));
    }

}