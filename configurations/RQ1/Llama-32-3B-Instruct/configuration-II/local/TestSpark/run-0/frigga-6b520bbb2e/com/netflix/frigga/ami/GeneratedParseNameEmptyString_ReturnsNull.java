package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedParseNameEmptyString_ReturnsNull {

    @Test
    public void parseNameEmptyString_ReturnsNull() {
        String amiName = "";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName);
    }

}