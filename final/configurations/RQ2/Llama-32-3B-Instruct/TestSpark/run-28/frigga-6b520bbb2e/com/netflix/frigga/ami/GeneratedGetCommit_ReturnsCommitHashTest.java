package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetCommit_ReturnsCommitHashTest {

    @Test
    public void getCommit_ReturnsCommitHashTest() {
        String commit = "12345";
        assertTrue(AppVersion.parseName("0.9.2-0-12345").getCommit().equals(commit));
    }

}