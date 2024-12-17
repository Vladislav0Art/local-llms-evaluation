package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.AfterEach;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestParseNameNull {

    private AppVersion appVersion = new AppVersion();

    @Before
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testParseNameNull() {
        when(appVersion.getParser().parseName(null)).thenReturn(new AppVersion());
        try {
            appVersion.parseName(null);
            fail();
        } catch (Exception e) {
        }

        when(appVersion.getParser().parseName("invalidamiName")).thenReturn(null);

        try {
            appVersion.parseName("invalidamiName");
            fail();
        } catch (Exception e) {
        }

        AppVersion parsedVersion = appVersion.parseName("");
        assertEquals(0, parsedVersion.getVersion());
    }

}