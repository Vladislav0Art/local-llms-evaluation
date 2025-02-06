package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetVersion_ReturnsExpectedValue {

    @Test
    public void getVersion_ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion("1.0");
        assertEquals("3.0.2", appVersion.getVersion());
    }

}