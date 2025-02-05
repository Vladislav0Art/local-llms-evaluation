package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetCommitTest {

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.frigga.ami.AppVersion-testversion-commit-testCommit");
        assertEquals("testCommit", appVersion.getCommit());
    }

}