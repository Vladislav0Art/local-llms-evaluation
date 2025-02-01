package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        assertNotNull(AppVersion.getAppVersionPattern());
        assertEquals(
                "[" + NameConstants.NAME_HYPHEN_CHARS + "]+-[0-9.a-zA-Z~]+-\\w+(?:\\.\\w+)?(?:\\/[" + NameConstants.NAME_HYPHEN_CHARS + "]+\\/[0-9]+)?",
                AppVersion.getAppVersionPattern().pattern()
        );
    }

}