package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetCommit_ValidCommit {

    @Test
    public void getCommit_ValidCommit() {
        String commit = "commit-id";
        AppVersion appVersion = new AppVersion("ami-123456789012345678901234567890", "", "");
        appVersion.setCommit(commit);
        assertEquals(commit, appVersion.getCommit());
    }

}