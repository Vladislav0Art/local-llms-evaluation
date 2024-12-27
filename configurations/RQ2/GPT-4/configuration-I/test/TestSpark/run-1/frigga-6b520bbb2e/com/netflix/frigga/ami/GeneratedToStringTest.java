package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String amiName = "AppName-buildJob1-v001-001-commit1";

        AppVersion appVersion = AppVersion.parseName(amiName);

        Assert.assertEquals("AppVersion{appName=AppName, version=v001, buildJobName=buildJob1, buildNumber=001, commit=commit1}", appVersion.toString());
    }

}