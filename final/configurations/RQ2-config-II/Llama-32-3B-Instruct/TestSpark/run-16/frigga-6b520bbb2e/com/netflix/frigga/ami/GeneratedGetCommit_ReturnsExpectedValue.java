package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetCommit_ReturnsExpectedValue {

    @Test
    public void getCommit_ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion("1.0");
        assertEquals("1234", appVersion.getCommit());
    }

}