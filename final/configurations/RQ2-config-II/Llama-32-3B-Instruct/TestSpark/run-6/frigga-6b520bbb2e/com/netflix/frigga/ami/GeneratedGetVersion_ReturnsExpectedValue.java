package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedGetVersion_ReturnsExpectedValue {

    @Test
    public void getVersion_ReturnsExpectedValue() {
        String amiName = "ami-1234-abcde";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertThat(appVersion.getVersion(), is("1234"));
    }

}