package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.Mockito;

public class GeneratedGetCommit_ReturnsCorrectString {

    @Test
    public void getCommit_ReturnsCorrectString() {
        String commit = "789";
        AppVersion appVersion = new AppVersion();
        assertEquals(commit, appVersion.getCommit());
    }

}