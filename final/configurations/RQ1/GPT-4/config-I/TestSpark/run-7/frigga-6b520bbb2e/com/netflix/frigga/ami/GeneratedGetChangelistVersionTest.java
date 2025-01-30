package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetChangelistVersionTest {

    @Test
    public void getChangelistVersionTest() {
        String validAmiName = "package-1.6.0-h879547";
        AppVersion appVersion = AppVersion.parseName(validAmiName);
        Assert.assertNull(appVersion.getChangelist());
    }

}