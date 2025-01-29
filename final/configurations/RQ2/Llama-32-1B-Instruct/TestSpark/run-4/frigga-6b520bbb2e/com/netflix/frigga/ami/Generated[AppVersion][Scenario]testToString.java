package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[AppVersion][Scenario]

testToString {

    @Test
    public void [AppVersion][Scenario]testToString() {
        AppVersion appVersion = new AppVersion();
        String expected = "ami-abc123";
        Assert.assertEquals(expected, appVersion.toString());
    }

}