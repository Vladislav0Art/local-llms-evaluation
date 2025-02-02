package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedParseName_InvalidInput_ReturnsNull {

    @Test
    public void parseName_InvalidInput_ReturnsNull() {
        assertNull(AppVersion.parseName(null));
        assertNull(AppVersion.parseName("invalid"));
    }

}