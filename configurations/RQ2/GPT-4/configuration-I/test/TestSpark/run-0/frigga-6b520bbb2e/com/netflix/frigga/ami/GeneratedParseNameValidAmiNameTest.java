package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedParseNameValidAmiNameTest {

    @Test
    public void parseNameValidAmiNameTest() {
        String amiName = "validAmi";
        AppVersion appVersion = AppVersion.parseName(amiName);

        Assert.assertNotNull(appVersion);
    }

}