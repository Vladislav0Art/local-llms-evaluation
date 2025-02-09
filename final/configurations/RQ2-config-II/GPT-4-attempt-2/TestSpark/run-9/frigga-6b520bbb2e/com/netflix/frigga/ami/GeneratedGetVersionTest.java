package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("com.package.version");
        Assert.assertEquals("version", appVersion.getVersion());
    }

}