package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedParseNameValidFormatTest {

    @Test
    public void parseNameValidFormatTest() {
        String amiName = "sample-1.0.0-h586499.sample-WE-WAPP-sample/150";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertEquals("sample", appVersion.getPackageName());
        Assert.assertEquals("1.0.0", appVersion.getVersion());
        Assert.assertEquals("WE-WAPP-sample", appVersion.getBuildJobName());
        Assert.assertEquals("586499", appVersion.getBuildNumber());
        Assert.assertEquals("sample", appVersion.getCommit());
    }

}