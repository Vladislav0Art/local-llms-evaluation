package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedParseNameInvalidPattern_ReturnsNull {

    @Test
    public void parseNameInvalidPattern_ReturnsNull() {
        String amiName = "invalid-pattern";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName);
    }

}