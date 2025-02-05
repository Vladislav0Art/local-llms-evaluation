package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameInvalidAmiNameTest {

    @Test
    public void parseNameInvalidAmiNameTest() {
        String amiName = "invalid-ami";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}