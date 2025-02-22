package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedTestParseName_invalidAppversion {

    @Test
    public void testParseName_invalidAppversion() {
        String invalidAppversion = "invalid-appversion";
        AppVersion appVersion = AppVersion.parseName(invalidAppversion);
        assertEquals(null, appVersion);
    }

}