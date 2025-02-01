package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        String amiName = "packageName-1.2.3-h123/commits/12";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertNotNull(appVersion);
        Assert.assertEquals("packageName", appVersion.getPackageName());
        Assert.assertEquals("1.2.3", appVersion.getVersion());
        Assert.assertEquals("commits", appVersion.getBuildJobName());
        Assert.assertEquals("123", appVersion.getBuildNumber());
        Assert.assertEquals("12", appVersion.getCommit());
    }

}