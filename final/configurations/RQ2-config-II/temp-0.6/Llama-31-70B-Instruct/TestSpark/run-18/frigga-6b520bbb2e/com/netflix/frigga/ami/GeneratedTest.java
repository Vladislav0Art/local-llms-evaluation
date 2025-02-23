package com.netflix.frigga.ami;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.netflix.frigga.ami.AppVersion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testParseNameWithNullString() {
        AppVersion parsedName = AppVersion.parseName(null);
        assertNull(parsedName);
    }

    @Test
    public void testParseNameWithValidAppversion() {
        AppVersion parsedName = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertEquals("586499", parsedName.getBuildNumber());
    }

    @Test
    public void testParseNameWithInvalidAppversion() {
        AppVersion parsedName = AppVersion.parseName("invalid-appversion");
        assertNull(parsedName);
    }

}