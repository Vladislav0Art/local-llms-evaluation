package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedEquals_DifferentAppVersion_ReturnsExpectedNotEqualsResult {

    @Test
    public void equals_DifferentAppVersion_ReturnsExpectedNotEqualsResult() {
        AppVersion appVersion1 = new AppVersion("ami-1234abcde7890fghi123");
        AppVersion appVersion2 = new AppVersion("ami-12345abcde7890fghi123");
        assertFalse(appVersion1.equals(appVersion2));
    }

}