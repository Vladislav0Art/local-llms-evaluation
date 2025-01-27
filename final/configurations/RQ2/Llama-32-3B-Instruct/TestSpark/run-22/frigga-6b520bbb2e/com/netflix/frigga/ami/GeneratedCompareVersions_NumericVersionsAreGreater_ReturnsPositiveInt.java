package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareVersions_NumericVersionsAreGreater_ReturnsPositiveInt {

    @Test
    public void compareVersions_NumericVersionsAreGreater_ReturnsPositiveInt() {
        String version1 = "10.20.30";
        String version2 = "9.20.30";
        int result = AppVersion.parseName(version1).compareTo(AppVersion.parseName(version2));
        assertThat(result, is(1));
    }

}