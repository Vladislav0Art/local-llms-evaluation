package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetCommit ReturnsCorrectCommit {

    @Test
    public void getCommit

    ReturnsCorrectCommit() {
        String commit = AppVersion.getCommit();
        assertNotNull(commit);
        assertTrue(commit.matches("[a-zA-Z0-9]+"));
    }

}