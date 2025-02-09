package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedToString_ValidAppVersion_ReturnsExpectedStringRepresentation {

    @Test
    public void toString_ValidAppVersion_ReturnsExpectedStringRepresentation() {
        AppVersion appVersion = new AppVersion("ami-1234abcde7890fghi123");
        String toString = appVersion.toString();
        assertNotNull(toString);
    }

}