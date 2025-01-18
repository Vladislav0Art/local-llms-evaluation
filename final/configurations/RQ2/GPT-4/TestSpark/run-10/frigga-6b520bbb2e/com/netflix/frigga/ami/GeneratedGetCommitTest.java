package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedGetCommitTest {

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("app-commit");
        String commit = appVersion.getCommit();
        assertEquals("commit", commit);
    }

}