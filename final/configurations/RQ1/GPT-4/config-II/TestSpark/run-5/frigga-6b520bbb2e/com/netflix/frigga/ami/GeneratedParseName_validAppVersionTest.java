package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseName_validAppVersionTest {

    @Test
    public void parseName_validAppVersionTest() {
        // Valid App Version test
        String testArgument = "subscriberha-1.0.0-h586499";
        AppVersion appVersion = AppVersion.parseName(testArgument);

        Assert.assertNotNull(appVersion);
        Assert.assertEquals("subscriberha", appVersion.getPackageName());
        Assert.assertEquals("1.0.0", appVersion.getVersion());
        Assert.assertEquals("586499", appVersion.getBuildNumber());
        Assert.assertNull(appVersion.getBuildJobName());
        Assert.assertNull(appVersion.getCommit());
    }

}