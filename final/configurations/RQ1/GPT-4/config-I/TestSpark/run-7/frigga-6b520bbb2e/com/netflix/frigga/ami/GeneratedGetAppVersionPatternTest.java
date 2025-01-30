package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        // has to be public, so in this case we can get it and compare with same one to test
        Assert.assertEquals(AppVersion.APP_VERSION_PATTERN,
                AppVersion.getAppVersionPattern());
    }

}