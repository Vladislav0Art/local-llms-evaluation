package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetPackageName_ReturnsExpectedValue {

    @Test
    public void getPackageName_ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion("1.0");
        assertEquals("com.netflix.frigga", appVersion.getPackageName());
    }

}