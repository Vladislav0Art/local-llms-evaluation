package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidInputTest {

    @Test
    public void parseNameValidInputTest() {
        String amiName = "ami-App1-v1.0";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

}