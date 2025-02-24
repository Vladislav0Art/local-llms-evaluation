package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParseNameInvalidTest {

    @Test
    public void parseNameInvalidTest() {
        AppVersion appVersion = AppVersion.parseName("invalid");
        assertNotNull(appVersion);
    }

}