package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetVersionReturnsEmptyStringWhenNoVersionGiven {

    @Test
    public void getVersionReturnsEmptyStringWhenNoVersionGiven() {
        AppVersion appVersion = new AppVersion();
        assertNotNull(appVersion.getVersion());
        assertEquals("", appVersion.getVersion());
    }

}