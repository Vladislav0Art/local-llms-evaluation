package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = new AppVersion("test-1.0.0-22");
        Assert.assertTrue(appVersion.toString().contains(appVersion.getPackageName()));
        Assert.assertTrue(appVersion.toString().contains(appVersion.getVersion()));
        Assert.assertTrue(appVersion.toString().contains(appVersion.getBuildJobName()));
    }

}