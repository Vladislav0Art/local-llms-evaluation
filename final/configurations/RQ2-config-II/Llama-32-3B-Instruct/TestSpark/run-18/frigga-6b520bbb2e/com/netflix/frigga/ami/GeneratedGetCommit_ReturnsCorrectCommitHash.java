package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedGetCommit_ReturnsCorrectCommitHash {

    @Test
    public void getCommit_ReturnsCorrectCommitHash() {
        AppVersion appVersion = AppVersion.THRUE;
        assertThat(appVersion.getCommit(), is("abcdefg1234567890"));
    }

}