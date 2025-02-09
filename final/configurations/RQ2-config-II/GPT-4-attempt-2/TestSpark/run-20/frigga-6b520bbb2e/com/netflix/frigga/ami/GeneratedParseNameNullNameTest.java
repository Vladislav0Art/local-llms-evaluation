package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedParseNameNullNameTest {

    @Test
    public void parseNameNullNameTest() {
        AppVersion appVersion = AppVersion.parseName(null);

        Assert.assertNull(appVersion);
    }

}