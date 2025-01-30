package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();

        assertNotNull(pattern);
        assertEquals(AppVersion.APP_VERSION_PATTERN.toString(), pattern.toString());
    }

}