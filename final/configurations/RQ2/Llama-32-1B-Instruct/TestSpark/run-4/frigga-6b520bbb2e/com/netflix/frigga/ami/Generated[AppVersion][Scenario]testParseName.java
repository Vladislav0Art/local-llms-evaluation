package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[AppVersion][Scenario]

testParseName {

    @Test
    public void [AppVersion][Scenario]testParseName() {
        AppVersion appVersion = AppVersion.parseName("ami-abc123");
        Assert.assertTrue(appVersion != null);
        Assert.assertEquals(NameConstants.AMI_NAME, appVersion.getPackageName());
        Assert.assertEquals("abc", appVersion.getVersion());
    }

}