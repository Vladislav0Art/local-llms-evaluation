package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedParseNameInvalidAppVersionTest {

    @Test
    public void parseNameInvalidAppVersionTest() {
        String amiName = "subscriberha-1.0.0";
        AppVersion appVersion = AppVersion.parseName(amiName);

        assertNull(appVersion);
    }

}