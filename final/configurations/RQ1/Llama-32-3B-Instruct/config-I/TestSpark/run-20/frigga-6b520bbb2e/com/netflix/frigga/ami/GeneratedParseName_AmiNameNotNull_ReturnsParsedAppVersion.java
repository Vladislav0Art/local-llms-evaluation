package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedParseName_AmiNameNotNull_ReturnsParsedAppVersion {

    @Test
    public void parseName_AmiNameNotNull_ReturnsParsedAppVersion() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion, amiName == null ? null : parsedAppVersion);
    }

}