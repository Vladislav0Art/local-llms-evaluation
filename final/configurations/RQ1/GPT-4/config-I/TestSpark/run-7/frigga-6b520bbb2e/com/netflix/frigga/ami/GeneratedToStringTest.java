package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String validAmiName = "package-1.6.0-h879547";
        AppVersion appVersion = AppVersion.parseName(validAmiName);
        Assert.assertTrue(appVersion.toString().contains("AppVersion [packageName=package, version=1.6.0, buildJobName=null, buildNumber=879547, changelist=null]"));
    }

}