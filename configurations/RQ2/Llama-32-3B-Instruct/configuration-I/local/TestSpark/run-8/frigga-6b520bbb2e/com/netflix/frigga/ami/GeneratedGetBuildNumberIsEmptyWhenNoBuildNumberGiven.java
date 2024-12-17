package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetBuildNumberIsEmptyWhenNoBuildNumberGiven {

    @Test
    public void getBuildNumberIsEmptyWhenNoBuildNumberGiven() {
        AppVersion appVersion = new AppVersion();
        assertNotNull(appVersion.getBuildNumber());
        assertEquals("", appVersion.getBuildNumber());
    }

}