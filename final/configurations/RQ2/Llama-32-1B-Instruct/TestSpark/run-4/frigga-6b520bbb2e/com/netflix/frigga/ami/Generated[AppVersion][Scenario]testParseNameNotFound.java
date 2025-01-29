package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[AppVersion][Scenario]

testParseNameNotFound {

    @Test
    public void [AppVersion][Scenario]testParseNameNotFound() {
        AppVersion appVersion = AppVersion.parseName("ami-fgh789");
        Assert.assertTrue(appVersion == null);
    }

}