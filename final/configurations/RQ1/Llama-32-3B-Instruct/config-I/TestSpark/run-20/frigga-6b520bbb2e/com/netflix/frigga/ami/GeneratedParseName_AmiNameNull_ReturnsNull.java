package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedParseName_AmiNameNull_ReturnsNull {

    @Test
    public void parseName_AmiNameNull_ReturnsNull() {
        String amiName = null;
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion, amiName);
    }

}