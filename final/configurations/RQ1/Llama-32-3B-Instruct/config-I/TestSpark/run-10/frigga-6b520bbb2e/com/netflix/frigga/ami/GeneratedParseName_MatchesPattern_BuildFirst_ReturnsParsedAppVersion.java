package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedParseName_MatchesPattern_BuildFirst_ReturnsParsedAppVersion {

    @Test
    public void parseName_MatchesPattern_BuildFirst_ReturnsParsedAppVersion() {
        AppVersion parsed = AppVersion.parseName("subscriberha-h1.0.0-586499");
        assertEquals("subscriberha", parsed.packageName);
        assertEquals("h1.0.0-586499", parsed.version);
        assertNull(parsed.buildNumber);
        assertNull(parsed.commit);
        assertNull(parsed.buildJobName);
    }

}