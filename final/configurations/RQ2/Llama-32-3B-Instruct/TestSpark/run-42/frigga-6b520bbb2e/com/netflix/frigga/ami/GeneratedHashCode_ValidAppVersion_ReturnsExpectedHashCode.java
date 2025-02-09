package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedHashCode_ValidAppVersion_ReturnsExpectedHashCode {

    @Test
    public void hashCode_ValidAppVersion_ReturnsExpectedHashCode() {
        AppVersion appVersion = new AppVersion("ami-1234abcde7890fghi123");
        int hashcode = appVersion.hashCode();
        assertTrue(hashCode >= 0);
    }

}