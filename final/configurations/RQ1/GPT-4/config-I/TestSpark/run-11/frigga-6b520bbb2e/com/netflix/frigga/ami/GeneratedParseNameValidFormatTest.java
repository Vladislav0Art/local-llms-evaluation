package com.netflix.frigga.ami;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

import static org.junit.Assert.*;

public class GeneratedParseNameValidFormatTest {

    @Test
    public void parseNameValidFormatTest() {
        String validName = "subscriberha-1.0.0-h586499";
        AppVersion appVersion = AppVersion.parseName(validName);

        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("586499", appVersion.getBuildNumber());
    }

}