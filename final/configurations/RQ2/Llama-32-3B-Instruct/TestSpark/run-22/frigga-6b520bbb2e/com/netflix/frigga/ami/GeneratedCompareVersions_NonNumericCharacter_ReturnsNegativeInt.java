package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareVersions_NonNumericCharacter_ReturnsNegativeInt {

    @Test
    public void compareVersions_NonNumericCharacter_ReturnsNegativeInt() {
        String version1 = "test";
        String version2 = "te-st";
        int result = AppVersion.parseName(version1).compareTo(AppVersion.parseName(version2));
        assertThat(result, is(-1));
    }

}