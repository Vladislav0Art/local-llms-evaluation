package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedParseNameInvalidTest {

    @Test
    public void parseNameInvalidTest() {
        AppVersion appVersion = AppVersion.parseName("invalid_name");
        Assert.assertNull(appVersion);
    }

}