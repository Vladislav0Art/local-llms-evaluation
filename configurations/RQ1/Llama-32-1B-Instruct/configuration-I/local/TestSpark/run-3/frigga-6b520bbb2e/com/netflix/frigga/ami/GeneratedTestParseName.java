package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.AfterEach;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestParseName {

    private AppVersion appVersion = new AppVersion();

    @Before
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testParseName() {
        String amiName = "subscriberha-1.0.0-586499";
        when(appVersion.getParser().parseName(amiName)).thenReturn(new AppVersion());
        AppVersion parsedVersion = appVersion.parseName(amiName);
        assertEquals("subscriberha-1.0.0-586499", parsedVersion.getPackageName());
    }

}