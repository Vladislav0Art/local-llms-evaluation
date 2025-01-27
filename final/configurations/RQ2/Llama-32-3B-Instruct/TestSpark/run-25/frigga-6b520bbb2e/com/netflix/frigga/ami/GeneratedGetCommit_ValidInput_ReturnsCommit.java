package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetCommit_ValidInput_ReturnsCommit {

    @Test
    public void getCommit_ValidInput_ReturnsCommit() {
        AppVersion appVersion = new AppVersion("1.0-1");
        String commit = appVersion.getCommit();
        assertNotNull(commit);
    }

}