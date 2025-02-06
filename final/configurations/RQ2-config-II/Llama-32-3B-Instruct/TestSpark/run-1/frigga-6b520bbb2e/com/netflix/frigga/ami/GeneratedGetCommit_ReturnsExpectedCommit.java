package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetCommit_ReturnsExpectedCommit {

    @Test
    public void getCommit_ReturnsExpectedCommit() {
        String commit = "abc123def456";
        assertEquals(commit, AppVersion.parseName("ami-1234567890").getCommit());
    }

}