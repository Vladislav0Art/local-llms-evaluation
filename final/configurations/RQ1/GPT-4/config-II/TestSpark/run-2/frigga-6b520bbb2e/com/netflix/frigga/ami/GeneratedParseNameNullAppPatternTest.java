package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedParseNameNullAppPatternTest {

    @Test
    public void parseNameNullAppPatternTest() {
        String amiName = null;
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertNull(appVersion);
    }

}