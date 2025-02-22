package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

public class GeneratedParseNameTest3 {

    @Test
    public void parseNameTest3() {
        String amiName = "subscriberha-1.0.0-586499.h150";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertNull(appVersion.getBuildJobName());
        assertNull(appVersion.getBuildNumber());
        assertEquals("586499.h150", appVersion.getCommit());
    }

}