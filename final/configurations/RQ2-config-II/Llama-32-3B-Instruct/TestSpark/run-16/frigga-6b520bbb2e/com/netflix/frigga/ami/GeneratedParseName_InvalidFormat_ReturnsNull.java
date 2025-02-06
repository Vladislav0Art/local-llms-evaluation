package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedParseName_InvalidFormat_ReturnsNull {

    @Test
    public void parseName_InvalidFormat_ReturnsNull() {
        String invalid = "invalid";
        assertNull(AppVersion.parseName(invalid));
    }

}