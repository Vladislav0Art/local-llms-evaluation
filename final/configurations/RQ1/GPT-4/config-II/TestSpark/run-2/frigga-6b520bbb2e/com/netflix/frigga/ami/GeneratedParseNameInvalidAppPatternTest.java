package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedParseNameInvalidAppPatternTest {

    @Test
    public void parseNameInvalidAppPatternTest() {
        String amiName = "invalidAMIName";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertNull(appVersion);
    }

}