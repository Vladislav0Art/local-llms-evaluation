package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetCommitTest {

    @Test
    public void getCommitTest() {
        AppVersion appVersion = new AppVersion();
        String result = appVersion.getCommit();
        assertNotNull(result);
    }

}