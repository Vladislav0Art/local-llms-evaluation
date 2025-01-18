package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetCommitTest {

    @Test
    public void getCommitTest() {
        String appName = "commit1";
        AppVersion appVersion = AppVersion.parseName(appName);
        assertEquals(appName, appVersion.getCommit());
    }

}