package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedParseNameInvalidAmiNameTest {

    @Test
    public void parseNameInvalidAmiNameTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertNull(appVersion);
    }

}