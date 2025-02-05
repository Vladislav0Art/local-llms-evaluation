package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        AppVersion appVersion = AppVersion.parseName("hai-3.4.5-h33");
        Assert.assertNotNull(appVersion);
    }

}