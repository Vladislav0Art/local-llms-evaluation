package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import static org.mockito.Mockito.*;

public class GeneratedParseName_NullString_ThrowsNullPointerException {

    @Test
    public void parseName_NullString_ThrowsNullPointerException() {
        try {
            AppVersion.parseName(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}