package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedToString_ReturnsExpectedString {

    @Test
    public void toString_ReturnsExpectedString() {
        AppVersion appVersion = new AppVersion("1.0");
        assertTrue(appVersion.toString().contains(appVersion.getVersion()));
    }

}