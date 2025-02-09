package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetVersion_ValidAppVersion_ReturnsExpectedVersion {

    @Test
    public void getVersion_ValidAppVersion_ReturnsExpectedVersion() {
        AppVersion appVersion = new AppVersion("ami-1234abcde7890fghi123");
        String version = appVersion.getVersion();
        assertEquals("1.2.3.4", version);
    }

}