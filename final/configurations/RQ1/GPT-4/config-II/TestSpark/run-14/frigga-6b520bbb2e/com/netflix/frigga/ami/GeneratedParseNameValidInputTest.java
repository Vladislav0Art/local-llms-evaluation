package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidInputTest {

    @Test
    public void parseNameValidInputTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver = AppVersion.parseName(name);

        assertNotNull(ver);
        assertEquals("subscriberha", ver.getPackageName());
        assertEquals("1.0.0", ver.getVersion());
        assertEquals("150", ver.getBuildNumber());
        assertEquals("WE-WAPP-subscriberha", ver.getBuildJobName());
        assertEquals("586499", ver.getCommit());
    }

}