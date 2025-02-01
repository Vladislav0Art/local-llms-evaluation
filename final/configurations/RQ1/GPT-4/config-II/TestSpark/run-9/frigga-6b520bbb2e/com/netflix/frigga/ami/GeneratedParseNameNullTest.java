package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedParseNameNullTest {

    @Test
    public void parseNameNullTest() {
        AppVersion appVersion = AppVersion.parseName(null);
        Assert.assertNull(appVersion);
    }

}