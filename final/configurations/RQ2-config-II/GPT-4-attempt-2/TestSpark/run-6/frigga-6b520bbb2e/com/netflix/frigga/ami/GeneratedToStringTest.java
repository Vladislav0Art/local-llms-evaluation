package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String appVersionStr = appVersion.toString();
        Assert.assertNotNull(appVersionStr);
    }

}