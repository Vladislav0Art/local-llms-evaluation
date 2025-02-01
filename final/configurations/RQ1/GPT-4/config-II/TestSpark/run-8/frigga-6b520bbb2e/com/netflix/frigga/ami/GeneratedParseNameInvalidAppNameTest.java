package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNameInvalidAppNameTest {

    @Test
    public void parseNameInvalidAppNameTest() {
        String invalidAppName = "invalidAppName";
        AppVersion appVersion = AppVersion.parseName(invalidAppName);

        Assert.assertNull(appVersion);
    }

}