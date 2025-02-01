package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;

public class GeneratedGetBuildNumberTest {

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/JENKINS/150");
        Assert.assertEquals("150", appVersion.getBuildNumber());
    }

}