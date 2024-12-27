package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedGetBuildJobNameTest {

    @Test
    public void getBuildJobNameTest() {
        String amiName = "AppName-buildJob1-v001";

        AppVersion appVersion = AppVersion.parseName(amiName);

        Assert.assertEquals("buildJob1", appVersion.getBuildJobName());
    }

}