package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseName_validAppVersionWithJobNameTest {

    @Test
    public void parseName_validAppVersionWithJobNameTest() {
        String testArgument = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(testArgument);

        Assert.assertNotNull(appVersion);
        Assert.assertEquals("WE-WAPP-subscriberha", appVersion.getBuildJobName());
    }

}