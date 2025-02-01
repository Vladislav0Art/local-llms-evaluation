package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetCommitTest {

    @Test
    public void getCommitTest() {
        String appVersionString = "subscriberha-1.0.0-h586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(appVersionString);

        assertEquals("150", appVersion.getCommit());
    }

}