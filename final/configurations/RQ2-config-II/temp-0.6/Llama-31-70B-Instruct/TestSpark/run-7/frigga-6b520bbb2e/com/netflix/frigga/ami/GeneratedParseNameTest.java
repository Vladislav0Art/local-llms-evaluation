package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("h150", appVersion.getCommit());
        assertEquals("WE-WAPP-subscriberha", appVersion.getBuildJobName());
        assertEquals("150", appVersion.getBuildNumber());
    }

}