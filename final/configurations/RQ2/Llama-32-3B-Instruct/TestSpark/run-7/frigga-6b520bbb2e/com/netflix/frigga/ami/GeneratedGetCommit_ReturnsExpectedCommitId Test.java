package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetCommit_ReturnsExpectedCommitId Test {

    @Test
    public void getCommit_ReturnsExpectedCommitId

    Test() {
        AppVersion appVersion = new AppVersion("1.0-123456789");
        assertEquals("789", appVersion.getCommit());
    }

}