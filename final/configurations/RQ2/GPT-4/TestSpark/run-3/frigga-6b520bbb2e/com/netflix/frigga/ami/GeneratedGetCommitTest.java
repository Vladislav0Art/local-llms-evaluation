package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedGetCommitTest {

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        assertNotNull(appVersion.getCommit());
    }

}