package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedParseNameEmptyInputTest {

    @Test
    public void parseNameEmptyInputTest() {
        String amiName = "";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertNull(appVersion);
    }

}