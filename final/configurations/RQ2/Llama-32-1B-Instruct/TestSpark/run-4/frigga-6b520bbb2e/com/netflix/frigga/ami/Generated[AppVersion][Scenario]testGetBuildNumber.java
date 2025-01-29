package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[AppVersion][Scenario]

testGetBuildNumber {

    @Test
    public void [AppVersion][Scenario]testGetBuildNumber() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildNumber("2023-02-15T12:00:01.000Z");
        Assert.assertEquals(2023, appVersion.getBuildNumber().length());
    }

}