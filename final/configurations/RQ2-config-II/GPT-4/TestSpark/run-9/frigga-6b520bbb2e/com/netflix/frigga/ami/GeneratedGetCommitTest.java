package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetCommitTest {

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("test-ami-0.0.1-build01-g123abc");
        assertEquals("g123abc", appVersion.getCommit());
    }

}