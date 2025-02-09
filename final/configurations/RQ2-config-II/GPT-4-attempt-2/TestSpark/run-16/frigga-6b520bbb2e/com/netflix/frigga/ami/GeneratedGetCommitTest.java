package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetCommitTest {

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("app-version-sample");
        assertEquals("commit", appVersion.getCommit());
    }

}