package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedCompareTo_SameVersion_ReturnsZero {

    @Test
    public void compareTo_SameVersion_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion("ami-1234-abcde");
        AppVersion appVersion2 = new AppVersion("ami-1234-abcde");
        int result = appVersion1.compareTo(appVersion2);
        assertThat(result, is(0));
    }

}