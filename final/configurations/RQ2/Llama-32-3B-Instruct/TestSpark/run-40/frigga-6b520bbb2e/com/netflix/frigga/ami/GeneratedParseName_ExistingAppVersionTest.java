package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

public class GeneratedParseName_ExistingAppVersionTest {

    @Test
    public void parseName_ExistingAppVersionTest() {
        String amiName = "1.0.2-20180808T1439Z";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

}