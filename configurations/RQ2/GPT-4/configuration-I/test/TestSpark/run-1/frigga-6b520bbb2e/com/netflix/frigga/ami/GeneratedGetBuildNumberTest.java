package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedGetBuildNumberTest {

    @Test
    public void getBuildNumberTest() {
        String amiName = "AppName-buildJob1-v001-001";

        AppVersion appVersion = AppVersion.parseName(amiName);

        Assert.assertEquals("001", appVersion.getBuildNumber());
    }

}