package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetCommit_ReturnsCorrectCommit {

    @Test
    public void getCommit_ReturnsCorrectCommit() {
        AppVersion appVersion = new AppVersion("ami-123");
        assertEquals("commit-hash", appVersion.getCommit());
    }

}