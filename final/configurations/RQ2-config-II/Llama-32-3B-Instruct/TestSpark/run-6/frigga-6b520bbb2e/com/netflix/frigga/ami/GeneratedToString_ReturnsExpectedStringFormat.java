package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedToString_ReturnsExpectedStringFormat {

    @Test
    public void toString_ReturnsExpectedStringFormat() {
        AppVersion appVersion = new AppVersion("ami-1234-abcde");
        String expected = "com.netflix.frigga.ami@1234";
        assertThat(appVersion.toString(), is(expected));
    }

}