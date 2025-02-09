package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameInvalidInputTest {

    @Test
    public void parseNameInvalidInputTest() {
        String amiName = "ami-Invalid";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}