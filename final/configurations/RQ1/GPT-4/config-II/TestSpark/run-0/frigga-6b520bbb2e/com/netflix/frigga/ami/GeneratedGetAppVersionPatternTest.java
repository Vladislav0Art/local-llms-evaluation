package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        Matcher matcher = AppVersion.getAppVersionPattern().matcher("subscriberha-1.0.0-h586499.h150/JENKINS/150");
        Assert.assertTrue(matcher.matches());
    }

}