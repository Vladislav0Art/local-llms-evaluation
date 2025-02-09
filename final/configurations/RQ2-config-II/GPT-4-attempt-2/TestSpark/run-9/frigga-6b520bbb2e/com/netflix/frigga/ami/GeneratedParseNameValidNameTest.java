package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedParseNameValidNameTest {

    @Test
    public void parseNameValidNameTest() {
        AppVersion appVersion = AppVersion.parseName("appVersionName");
        Assert.assertNotNull(appVersion);
    }

}