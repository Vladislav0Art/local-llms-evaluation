package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNameValidPatternTest {

    @Test
    public void parseNameValidPatternTest() {
        String validAmiName = "package-1.6.0-h879547";
        AppVersion result = AppVersion.parseName(validAmiName);
        Assert.assertNotNull(result);
        Assert.assertEquals("package", result.getPackageName());
        Assert.assertEquals("1.6.0", result.getVersion());
        Assert.assertEquals("879547", result.getBuildNumber());
    }

}