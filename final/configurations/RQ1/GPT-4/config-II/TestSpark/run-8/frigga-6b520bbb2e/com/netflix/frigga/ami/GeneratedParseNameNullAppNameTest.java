package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNameNullAppNameTest {

    @Test
    public void parseNameNullAppNameTest() {
        AppVersion appVersion = AppVersion.parseName(null);

        Assert.assertNull(appVersion);
    }

}