package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertNotNull(appVersion);
    }

}