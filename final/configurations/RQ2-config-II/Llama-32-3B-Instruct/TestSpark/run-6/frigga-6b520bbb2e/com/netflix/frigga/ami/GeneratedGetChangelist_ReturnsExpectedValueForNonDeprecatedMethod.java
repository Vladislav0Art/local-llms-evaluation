package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedGetChangelist_ReturnsExpectedValueForNonDeprecatedMethod {

    @Test
    public void getChangelist_ReturnsExpectedValueForNonDeprecatedMethod() {
        String amiName = "ami-1234-abcde";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertThat(appVersion.toString(), is("com.netflix.frigga.ami@1234"));
    }

}