package com.netflix.frigga.ami;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestParseName {

    private AppVersion appVersion;

    @Before
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testParseName() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedName = appVersion.parseName(amiName);
        assertNotNull(parsedName);
    }

}