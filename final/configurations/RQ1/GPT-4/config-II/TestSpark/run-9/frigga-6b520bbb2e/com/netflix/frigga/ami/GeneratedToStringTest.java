package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("packageName-1.2.3-h123/commits/12");
        Assert.assertEquals("AppVersion [packageName=packageName, version=1.2.3, buildJobName=commits, buildNumber=123, changelist=12]", appVersion.toString());
    }

}