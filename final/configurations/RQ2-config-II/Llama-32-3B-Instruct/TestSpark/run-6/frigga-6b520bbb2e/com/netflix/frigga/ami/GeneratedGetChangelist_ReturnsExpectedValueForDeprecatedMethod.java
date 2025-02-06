package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedGetChangelist_ReturnsExpectedValueForDeprecatedMethod {

    @Test
    public void getChangelist_ReturnsExpectedValueForDeprecatedMethod() {
        String amiName = "ami-1234-abcde";
        AppVersion appVersion = new AppVersion();
        assertThat(appVersion.getChangelist(), is("1234"));
    }

}