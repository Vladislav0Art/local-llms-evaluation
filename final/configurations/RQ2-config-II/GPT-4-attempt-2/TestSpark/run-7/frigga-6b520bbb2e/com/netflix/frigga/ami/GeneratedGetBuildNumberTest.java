package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetBuildNumberTest {

    @Test
    public void getBuildNumberTest() {
        AppVersion version = AppVersion.parseName("appversion-test");
        Assert.assertNotNull(version.getBuildNumber());
    }

}