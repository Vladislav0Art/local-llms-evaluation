package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetBuildJobNameTest {

    @Test
    public void getBuildJobNameTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String buildJobName = appVersion.getBuildJobName();
        Assert.assertNotNull(buildJobName);
    }

}