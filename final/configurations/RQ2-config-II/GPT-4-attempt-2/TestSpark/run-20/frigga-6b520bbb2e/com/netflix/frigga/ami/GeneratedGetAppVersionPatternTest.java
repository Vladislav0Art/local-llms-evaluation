package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();

        Assert.assertNotNull(pattern);
    }

}