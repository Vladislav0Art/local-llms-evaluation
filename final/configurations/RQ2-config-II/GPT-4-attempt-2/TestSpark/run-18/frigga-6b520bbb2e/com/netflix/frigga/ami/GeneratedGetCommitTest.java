package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetCommitTest {

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.package-1.0.0-h0.abc123");
        assertEquals("abc123", appVersion.getCommit());
    }

}