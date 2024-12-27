package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedParseNameNullAmiNameTest {

    @Test
    public void parseNameNullAmiNameTest() {
        String amiName = null;
        AppVersion appVersion = AppVersion.parseName(amiName);

        Assert.assertNull(appVersion);
    }

}