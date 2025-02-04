package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

public class GeneratedParseName_MatchingPattern_ReturnsParsedAppVersion {

    @Test
    public void parseName_MatchingPattern_ReturnsParsedAppVersion() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion expected = new AppVersion();
        expected.packageName = "subscriberha";
        expected.version = "1.0.0-586499";
        AppVersion result = AppVersion.parseName(amiName);
        assertEquals(expected, result);
    }

}