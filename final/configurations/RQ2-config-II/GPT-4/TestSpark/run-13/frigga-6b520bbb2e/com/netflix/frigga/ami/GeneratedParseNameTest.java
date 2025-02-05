package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        String amiName = "packageName-1.0.0-h12.abcdefg";
        AppVersion result = AppVersion.parseName(amiName);
        Assert.assertEquals("packageName", result.getPackageName());
        Assert.assertEquals("1.0.0", result.getVersion());
        Assert.assertEquals("12", result.getBuildNumber());
        Assert.assertEquals("abcdefg", result.getCommit());
    }

}