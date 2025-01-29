package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[AppVersion][Scenario]

testGetHashCode {

    @Test
    public void [AppVersion][Scenario]testGetHashCode() {
        AppVersion appVersion = new AppVersion();
        int hashCode = appVersion.hashCode();
        Assert.assertTrue(hashCode >= 0);
    }

}