package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedParseNameValidAppPatternTest {

    @Test
    public void parseNameValidAppPatternTest() {
        String amiName = "subscriberha-1.0.0-h586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(amiName);

        Assert.assertNotNull(appVersion);
        Assert.assertEquals("subscriberha", appVersion.getPackageName());
        Assert.assertEquals("1.0.0", appVersion.getVersion());
        Assert.assertEquals("WE-WAPP-subscriberha", appVersion.getBuildJobName());
        Assert.assertEquals("586499", appVersion.getBuildNumber());
        Assert.assertEquals("150", appVersion.getCommit());
    }

}