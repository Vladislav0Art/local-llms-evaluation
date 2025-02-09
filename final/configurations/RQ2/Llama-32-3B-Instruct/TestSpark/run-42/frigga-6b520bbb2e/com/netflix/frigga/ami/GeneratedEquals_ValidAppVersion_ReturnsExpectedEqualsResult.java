package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedEquals_ValidAppVersion_ReturnsExpectedEqualsResult {

    @Test
    public void equals_ValidAppVersion_ReturnsExpectedEqualsResult() {
        AppVersion appVersion1 = new AppVersion("ami-1234abcde7890fghi123");
        AppVersion appVersion2 = new AppVersion("ami-1234abcde7890fghi123");
        assertTrue(appVersion1.equals(appVersion2));
    }

}