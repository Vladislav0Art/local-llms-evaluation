package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetVersion_NullAppVersion_ReturnsNull {

    @Test
    public void getVersion_NullAppVersion_ReturnsNull() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getVersion());
    }

}