package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedParseNameValidAmiNameTest {

    @Test
    public void parseNameValidAmiNameTest() {
        String amiName = "name-1.0.0-10-h123";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertNotNull(appVersion);
    }

}