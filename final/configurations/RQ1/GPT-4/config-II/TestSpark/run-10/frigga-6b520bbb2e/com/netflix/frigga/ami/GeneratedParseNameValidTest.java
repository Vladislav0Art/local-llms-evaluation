package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidTest {

    @Test
    public void parseNameValidTest() {
        String validAppName = "subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150";

        AppVersion testedVersion = AppVersion.parseName(validAppName);

        assertEquals("subscriberha", testedVersion.getPackageName());
        assertEquals("1.0.0", testedVersion.getVersion());
        assertEquals("h586499", testedVersion.getBuildJobName());
        assertEquals("586499", testedVersion.getBuildNumber());
        assertNull(testedVersion.getCommit());
    }

}