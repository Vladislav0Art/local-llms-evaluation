package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareVersions_EmptyString_ReturnsZero {

    @Test
    public void compareVersions_EmptyString_ReturnsZero() {
        String version1 = "test";
        String version2 = "";
        int result = AppVersion.parseName(version1).compareTo(AppVersion.parseName(version2));
        assertThat(result, is(0));
    }

}