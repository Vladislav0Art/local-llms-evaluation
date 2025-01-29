package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[AppVersion][Scenario]

testGetVersion {

    @Test
    public void [AppVersion][Scenario]testGetVersion() {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion("1.0.0");
        Assert.assertEquals("1.0.0", appVersion.getVersion());
    }

}