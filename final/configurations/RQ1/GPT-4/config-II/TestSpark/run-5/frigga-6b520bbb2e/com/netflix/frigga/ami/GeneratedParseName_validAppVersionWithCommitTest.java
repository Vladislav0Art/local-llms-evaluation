package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseName_validAppVersionWithCommitTest {

    @Test
    public void parseName_validAppVersionWithCommitTest() {
        String testArgument = "subscriberha-1.0.0-586499.h150";
        AppVersion appVersion = AppVersion.parseName(testArgument);

        Assert.assertNotNull(appVersion);
        Assert.assertEquals("h150", appVersion.getCommit());
    }

}