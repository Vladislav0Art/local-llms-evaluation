package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameInvalidAmiNameTest {

    @Test
    public void parseNameInvalidAmiNameTest() {
        AppVersion appVersion = AppVersion.parseName("invalidAmiName");
        assertNull(appVersion);
    }

}