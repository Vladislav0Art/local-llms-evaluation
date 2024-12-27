package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        String amiName = "AppName-v001";

        AppVersion appVersion = AppVersion.parseName(amiName);

        Assert.assertNotNull(appVersion);
    }

}