package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[AppVersion][Scenario]

testGetCommit {

    @Test
    public void [AppVersion][Scenario]testGetCommit() {
        AppVersion appVersion = new AppVersion();
        appVersion.setCommit("abc123");
        Assert.assertEquals("abc123", appVersion.getCommit());
    }

}