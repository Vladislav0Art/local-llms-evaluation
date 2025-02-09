package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String version = appVersion.getVersion();
        Assert.assertNotNull(version);
    }

}