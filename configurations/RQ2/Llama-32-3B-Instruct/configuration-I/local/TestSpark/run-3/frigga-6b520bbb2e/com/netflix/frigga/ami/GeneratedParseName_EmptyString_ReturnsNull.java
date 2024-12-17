package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseName_EmptyString_ReturnsNull {

    @Test
    public void parseName_EmptyString_ReturnsNull() {
        String amiName = "";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName);
    }

}