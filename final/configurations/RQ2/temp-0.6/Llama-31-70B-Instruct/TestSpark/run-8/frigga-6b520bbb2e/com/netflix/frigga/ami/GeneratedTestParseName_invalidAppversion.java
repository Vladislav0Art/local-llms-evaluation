package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class GeneratedTestParseName_invalidAppversion {

    @Test
    public void testParseName_invalidAppversion() {
        String appversion = "subscriberha-1.0.0-586499";
        AppVersion parsedAppversion = AppVersion.parseName(appversion);
        assertNull(parsedAppversion);
    }

}