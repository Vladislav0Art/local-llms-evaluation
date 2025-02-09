package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetBuildNumberTest {

    @Test
    public void getBuildNumberTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String buildNumber = appVersion.getBuildNumber();
        Assert.assertNotNull(buildNumber);
    }

}