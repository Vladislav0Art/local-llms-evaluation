package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        String amiName = "AppName-v001";

        AppVersion appVersion = AppVersion.parseName(amiName);

        String version = appVersion.getVersion();

        Assert.assertEquals("v001", version);
    }

}