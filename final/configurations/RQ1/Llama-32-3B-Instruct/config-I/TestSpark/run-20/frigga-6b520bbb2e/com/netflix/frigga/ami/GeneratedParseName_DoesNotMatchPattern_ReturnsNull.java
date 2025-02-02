package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedParseName_DoesNotMatchPattern_ReturnsNull {

    @Test
    public void parseName_DoesNotMatchPattern_ReturnsNull() {
        String amiName = "subscriberha-1.0.0";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion, amiName);
    }

}