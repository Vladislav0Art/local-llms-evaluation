package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        Pattern result = AppVersion.getAppVersionPattern();
        Assert.assertNotNull(result);
    }

}