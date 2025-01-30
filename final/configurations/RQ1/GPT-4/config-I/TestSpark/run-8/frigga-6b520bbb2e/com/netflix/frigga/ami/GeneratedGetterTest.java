package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetterTest {

    @Test
    public void getterTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499");
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertNull(appVersion.getBuildJobName());
        assertEquals("586499", appVersion.getBuildNumber());
        assertNull(appVersion.getCommit());
    }

}