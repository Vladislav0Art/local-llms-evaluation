package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedParseNameWithInvalidPatternTest {

    private AppVersion appVersion;

    @Before
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void parseNameWithInvalidPatternTest() {
        AppVersion parsedName = AppVersion.parseName("invalidPattern");
        assertNull(parsedName);
    }

}