package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedParseNameWithNullTest {

    private AppVersion appVersion;

    @Before
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void parseNameWithNullTest() {
        AppVersion parsedName = AppVersion.parseName(null);
        assertNull(parsedName);
    }

}