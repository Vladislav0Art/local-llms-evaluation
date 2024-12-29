package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        String testName = "amiName";
        AppVersion out = AppVersion.parseName(testName);
        Assert.assertNotNull(out);
    }

}