package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseName_invalidTest {

    @Test
    public void parseName_invalidTest() {
        String testArgument = "invalidAppVersion";
        AppVersion appVersion = AppVersion.parseName(testArgument);

        Assert.assertNull(appVersion);
    }

}