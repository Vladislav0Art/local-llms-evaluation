package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetVersion_ReturnsExpectedValue {

    @Test
    public void getVersion_ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion("version1");
        assertEquals("version1", appVersion.getVersion());
    }

}