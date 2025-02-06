package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedParseName_EmptyString_ReturnsNull {

    @Test
    public void parseName_EmptyString_ReturnsNull() {
        assertNull(AppVersion.parseName(""));
    }

}