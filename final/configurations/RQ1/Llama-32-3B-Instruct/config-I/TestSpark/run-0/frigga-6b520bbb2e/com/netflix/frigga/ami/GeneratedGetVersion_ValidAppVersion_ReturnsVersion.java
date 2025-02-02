package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetVersion_ValidAppVersion_ReturnsVersion {

    @Test
    public void getVersion_ValidAppVersion_ReturnsVersion() {
        AppVersion appVersion = new AppVersion();
        appVersion.version = "1.0.0-586499";
        assertEquals("1.0.0-586499", appVersion.getVersion());
    }

}