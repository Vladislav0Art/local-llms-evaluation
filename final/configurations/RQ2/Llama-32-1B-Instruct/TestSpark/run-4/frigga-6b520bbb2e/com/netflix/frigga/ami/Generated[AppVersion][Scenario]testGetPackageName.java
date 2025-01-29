package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[AppVersion][Scenario]

testGetPackageName {

    @Test
    public void [AppVersion][Scenario]testGetPackageName() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("example-123");
        Assert.assertEquals("example", appVersion.getPackageName());
    }

}