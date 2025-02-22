package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.mockito.Mockito;
import com.netflix.frigga.ami.AppVersion;

public class GeneratedTestParseName {

    @Test
    public void testParseName() {
        String name = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(name);
        assertNotNull(appVersion);
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("586499", appVersion.getBuildNumber());
        assertNull(appVersion.getBuildJobName());
    }

}