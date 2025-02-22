package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

public class GeneratedTestParseName {

    @Test
    public void testParseName() {
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertEquals("WE-WAPP-subscriberha", parsedName.getBuildJobName());
        assertEquals("150", parsedName.getBuildNumber());
        assertEquals("h150", parsedName.getCommit());
    }

}