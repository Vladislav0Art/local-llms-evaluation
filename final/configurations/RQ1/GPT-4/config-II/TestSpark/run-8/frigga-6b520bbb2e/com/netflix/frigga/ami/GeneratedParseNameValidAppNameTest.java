package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNameValidAppNameTest {

    @Test
    public void parseNameValidAppNameTest() {
        String validAppName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(validAppName);

        Assert.assertNotNull(appVersion);
        Assert.assertEquals("subscriberha", appVersion.getPackageName());
        Assert.assertEquals("1.0.0", appVersion.getVersion());
        Assert.assertEquals("586499", appVersion.getBuildNumber());
        Assert.assertEquals("h150", appVersion.getCommit());
        Assert.assertEquals("WE-WAPP-subscriberha", appVersion.getBuildJobName());
    }

}