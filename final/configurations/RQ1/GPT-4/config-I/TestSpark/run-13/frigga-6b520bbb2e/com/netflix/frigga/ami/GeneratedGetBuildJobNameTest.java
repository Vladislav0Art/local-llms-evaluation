package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetBuildJobNameTest {

    @Test
    public void getBuildJobNameTest() {
        AppVersion validAppVersion = AppVersion.parseName("subscriberha-1.0.0-h150/WE-WAPP-subscriberha/150");
        assertEquals("WE-WAPP-subscriberha", validAppVersion.getBuildJobName());
    }

}