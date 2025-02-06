package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedEquals_ReturnsExpectedValueForSameObject {

    @Test
    public void equals_ReturnsExpectedValueForSameObject() {
        AppVersion appVersion = new AppVersion("ami-1234-abcde");
        boolean result = appVersion.equals(appVersion);
        assertThat(result, is(true));
    }

}