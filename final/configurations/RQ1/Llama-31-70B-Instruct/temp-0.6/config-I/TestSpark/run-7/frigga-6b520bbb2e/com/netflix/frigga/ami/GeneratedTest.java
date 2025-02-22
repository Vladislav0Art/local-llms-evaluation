package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.netflix.frigga.ami.AppVersion;

import java.util.regex.Pattern;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testParseName_validInput() {
        String input = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(input);
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("586499", appVersion.getBuildNumber());
    }

}